package com.lh.backend.service.impl.user.bot;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lh.backend.mapper.BotMapper;
import com.lh.backend.pojo.Bot;
import com.lh.backend.pojo.User;
import com.lh.backend.service.impl.utils.UserDetailsImpl;
import com.lh.backend.service.user.bot.GetListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:GetServiceImpl
 * Package:com.lh.backend.service.impl.user.bot
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/1/22-15:00
 * @version:v1.0
 */
@Service
public class GetServiceImpl implements GetListService{
    @Autowired
    private BotMapper botMapper;
    @Override
    public List<Bot> getList() {
        UsernamePasswordAuthenticationToken authenticationToken =
                (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        UserDetailsImpl loginUser = (UserDetailsImpl) authenticationToken.getPrincipal();
        User user = loginUser.getUser();

        QueryWrapper<Bot> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id", user.getId());
        return botMapper.selectList(queryWrapper);
    }
}
