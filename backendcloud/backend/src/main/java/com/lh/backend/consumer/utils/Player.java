package com.lh.backend.consumer.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName:Player
 * Package:com.lh.backend.consumer.utils
 * Description: 存储玩家信息(id, 位置, 移动路径)
 *
 * @author:LH寒酥
 * @create:2025/1/26-13:24
 * @version:v1.0
 */
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    private Integer id;
    private Integer botId; // -1 表示亲自出马，否则为托管的机器人id
    private String botCode;
    private Integer sx;
    private Integer sy;
    private List<Integer> steps;

    private boolean check_tail_increasing(int step) {  // 检验当前回合，蛇的长度是否增加
        if (step <= 10) return true;
        return step % 3 == 1;
    }

    public List<Cell> getCells() {
        List<Cell> res = new ArrayList<>();

        int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
        int x = sx, y = sy;
        int step = 0;
        res.add(new Cell(x, y));
        for (int d: steps) {
            x += dx[d];
            y += dy[d];
            res.add(new Cell(x, y));
            if (!check_tail_increasing( ++ step)) {
                res.remove(0);
            }
        }
        return res;
    }

    public String getStepsString() {
        StringBuilder res = new StringBuilder();
        for (int d: steps) {
            res.append(d);
        }
        return res.toString();
    }
}
