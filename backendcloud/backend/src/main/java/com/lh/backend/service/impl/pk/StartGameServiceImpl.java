package com.lh.backend.service.impl.pk;

import com.lh.backend.consumer.WebSocketServer;
import com.lh.backend.service.pk.StartGameService;
import org.springframework.stereotype.Service;

/**
 * ClassName:StartGameServiceImpl
 * Package:com.lh.backend.service.impl.pk
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/1/29-12:40
 * @version:v1.0
 */
@Service
public class StartGameServiceImpl implements StartGameService {
    @Override
    public String startGame(Integer aId, Integer bId) {
        System.out.println("start game..." + aId + " " + bId);
        try {
            WebSocketServer.startGame(aId, bId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "start game success";
    }
}
