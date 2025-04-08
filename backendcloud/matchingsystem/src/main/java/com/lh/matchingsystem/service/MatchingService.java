package com.lh.matchingsystem.service;

/**
 * ClassName:MatchingService
 * Package:service
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/1/29-10:12
 * @version:v1.0
 */
public interface MatchingService {
    String addPlayer(Integer userId, Integer rating, Integer botId);
    String removePlayer(Integer userId);
}
