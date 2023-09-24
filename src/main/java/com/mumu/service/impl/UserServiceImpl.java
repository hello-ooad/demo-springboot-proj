package com.mumu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mumu.entity.User;
import com.mumu.mapper.UserMapper;
import com.mumu.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mumu
 * @since 2023-09-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    UserMapper mapper;
    @Override
    public List<User> selectList() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        return mapper.selectList(queryWrapper);
    }
    @Override
    public boolean isusernameExists(String userName){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_name", userName);
        return mapper.selectCount(queryWrapper) > 0;
    }
    @Override
    public boolean isusernameExists(String userName,String password){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_name", userName);
        queryWrapper.eq("user_password", password);
        return mapper.selectCount(queryWrapper) > 0;
    }
}
