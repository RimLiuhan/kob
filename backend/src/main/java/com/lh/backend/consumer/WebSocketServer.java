package com.lh.backend.consumer;

/**
 * ClassName:WebSocketServer
 * Package:com.lh.backend.consumer
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/1/24-9:41
 * @version:v1.0
 */
import com.alibaba.fastjson2.JSONObject;
import com.lh.backend.consumer.utils.Game;
import com.lh.backend.consumer.utils.JwtAuthentication;
import com.lh.backend.mapper.UserMapper;
import com.lh.backend.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.websocket.*;
import jakarta.websocket.server.PathParam;
import jakarta.websocket.server.ServerEndpoint;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
@ServerEndpoint("/websocket/{token}")  // 注意不要以'/'结尾
public class WebSocketServer {
    final private static ConcurrentHashMap<Integer, WebSocketServer> users = new ConcurrentHashMap<>();
    final private static CopyOnWriteArrayList<User> matchpool = new CopyOnWriteArrayList<>();
    private User user;

    private Session session = null;

    private static UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        WebSocketServer.userMapper = userMapper;
    }

    @OnOpen
    public void onOpen(Session session, @PathParam("token") String token) throws IOException {
        // 建立连接
        this.session = session;
        System.out.println("connect success");
        Integer userId = JwtAuthentication.getUserId(token);
        this.user = userMapper.selectById(userId);

        if (this.user != null) {
            users.put(userId, this);
        } else {
            this.session.close();
        }
        System.out.println(users);
    }

    @OnClose
    public void onClose() {
        // 关闭链接
        System.out.println("disconnect");
        if (this.user != null) {
            users.remove(this.user.getId());
            matchpool.remove(this.user);
        }
    }

    private void startMatching() throws Exception {
        System.out.println("start matching");
        matchpool.add(this.user);
        while (matchpool.size() >= 2) {
            Iterator<User> it = matchpool.iterator();
            User a = it.next(), b = it.next();
            matchpool.remove(a);
            matchpool.remove(b);

            Game game = new Game(13, 14, 20);
            game.createMap();

            JSONObject respA = new JSONObject();
            respA.put("event", "start_matching");
            respA.put("opponent_username", b.getUsername());
            respA.put("opponent_photo", b.getPhoto());
            respA.put("game_map", game.getG());
            users.get(a.getId()).sendMessage(respA.toJSONString());

            JSONObject respB = new JSONObject();
            respB.put("event", "start_matching");
            respB.put("opponent_username", a.getUsername());
            respB.put("opponent_photo", a.getPhoto());
            respB.put("game_map", game.getG());
            users.get(b.getId()).sendMessage(respB.toJSONString());
        }
    }

    private void stopMatching() {
        System.out.println("stop matching");
        matchpool.remove(this.user);
    }

    @OnMessage
    public void onMessage(String message, Session session) throws Exception {
        // 从Client接收消息
        System.out.println("receive:" + message);
        JSONObject data = JSONObject.parseObject(message);
        String event = data.getString("event");
        if ("start_matching".equals(event)) {
            startMatching();
        } else if ("stop_matching".equals(event)) {
            stopMatching();
        }
    }

    @OnError
    public void onError(Session session, Throwable error) {
        error.printStackTrace();
    }

    public  void sendMessage(String message) throws Exception {
        this.session.getAsyncRemote().sendText(message);
    }
}