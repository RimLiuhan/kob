package com.lh.backend.service.ranklist;

import com.alibaba.fastjson2.JSONObject;

/**
 * ClassName:GetRanklistService
 * Package:com.lh.backend.service.ranklist
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/4/12-16:16
 * @version:v1.0
 */
public interface GetRanklistService {
    JSONObject getlist(Integer page);
}
