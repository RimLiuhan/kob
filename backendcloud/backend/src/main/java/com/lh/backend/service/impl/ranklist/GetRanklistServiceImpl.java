package com.lh.backend.service.impl.ranklist;

import com.alibaba.fastjson2.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lh.backend.mapper.UserMapper;
import com.lh.backend.pojo.User;
import com.lh.backend.service.ranklist.GetRanklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:GetRanklistServiceImpl
 * Package:com.lh.backend.service.impl.ranklist
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/4/12-16:17
 * @version:v1.0
 */
@Service
public class GetRanklistServiceImpl implements GetRanklistService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public JSONObject getlist(Integer page) {
        IPage<User> userIPage = new Page<>(page, 10);
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("rating");
        List<User> users = userMapper.selectPage(userIPage, queryWrapper).getRecords();
        for (User user : users)
            user.setPassword("");
        JSONObject resp = new JSONObject();
        resp.put("users", users);
        resp.put("count", userMapper.selectCount(null));
        return resp;
    }
}
