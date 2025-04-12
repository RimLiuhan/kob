package com.lh.backend.service.record;

import com.alibaba.fastjson2.JSONObject;

/**
 * ClassName:GetRecordListService
 * Package:com.lh.backend.service.record
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/4/12-9:39
 * @version:v1.0
 */
public interface GetRecordListService {
    JSONObject getList(Integer page);
}
