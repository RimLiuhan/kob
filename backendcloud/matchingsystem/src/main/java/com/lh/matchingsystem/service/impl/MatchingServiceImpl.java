package com.lh.matchingsystem.service.impl;

import org.springframework.stereotype.Service;
import com.lh.matchingsystem.service.MatchingService;
import com.lh.matchingsystem.service.impl.utils.MatchingPool;

/**
 * ClassName:MatchingServiceImpl
 * Package:service.impl
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/1/29-10:13
 * @version:v1.0
 */
@Service
public class MatchingServiceImpl implements MatchingService {
    public final static MatchingPool matchingPool = new MatchingPool();
    @Override
    public String addPlayer(Integer userId, Integer rating, Integer botId) {
        System.out.println("add player: " + userId);
        matchingPool.addPlayer(userId, rating, botId);
        return "add player success";
    }

    @Override
    public String removePlayer(Integer userId) {
        System.out.println("remove player: " + userId);
        matchingPool.removePlayer(userId);
        return "remove player success";
    }
}
