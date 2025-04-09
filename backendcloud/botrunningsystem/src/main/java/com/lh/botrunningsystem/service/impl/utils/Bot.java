package com.lh.botrunningsystem.service.impl.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName:Bot
 * Package:com.lh.botrunningsystem.service.impl
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/4/9-10:06
 * @version:v1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bot {
    Integer userId;
    String botCode;
    String input;
}
