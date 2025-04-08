package com.lh.matchingsystem.service.impl.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName:Player
 * Package:com.lh.matchingsystem.service.utils
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/1/29-11:18
 * @version:v1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {
    private Integer userId;
    private Integer rating;
    private Integer botId;
    private Integer waitingTime;
}
