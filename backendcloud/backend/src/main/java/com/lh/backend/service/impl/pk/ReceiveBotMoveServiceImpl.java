package com.lh.backend.service.impl.pk;

import com.lh.backend.consumer.WebSocketServer;
import com.lh.backend.consumer.utils.Game;
import com.lh.backend.service.pk.ReceiveBotMoveService;
import org.springframework.stereotype.Service;

/**
 * ClassName:ReceiveBotMoveServiceImpl
 * Package:com.lh.backend.service.impl.pk
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/4/9-15:04
 * @version:v1.0
 */
@Service
public class ReceiveBotMoveServiceImpl implements ReceiveBotMoveService {
    @Override
    public String receiveBotMove(Integer userId, Integer direction) {
        System.out.println("receive bot move: " + userId + " " + direction + " ");
        if (WebSocketServer.users.get(userId) != null) {
            Game game = WebSocketServer.users.get(userId).game;
            if (game != null) {
                if (game.getPlayerA().getId().equals(userId)) {
                    game.setNextStepA(direction);
                } else if (game.getPlayerB().getId().equals(userId)) {
                    game.setNextStepB(direction);
                }
            }
        }

        return "receive bot move success";
    }
}
