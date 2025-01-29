package com.lh.backend.controller.pk;

import com.lh.backend.consumer.WebSocketServer;
import com.lh.backend.service.pk.StartGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:StartGameController
 * Package:com.lh.backend.controller.pk
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/1/29-12:43
 * @version:v1.0
 */
@RestController
public class StartGameController {
    @Autowired
    private StartGameService startGameService;
    @PostMapping("/pk/start/game/")
    public String startGame(@RequestParam MultiValueMap<String, String> data) {
        Integer aId = Integer.parseInt(data.getFirst("a_id"));
        Integer bId = Integer.parseInt(data.getFirst("b_id"));
        return startGameService.startGame(aId, bId);
    }
}
