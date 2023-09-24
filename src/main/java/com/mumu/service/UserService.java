package com.mumu.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mumu.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author mumu
 * @since 2023-09-22
 */
public interface UserService extends IService<User> {

    List<User> selectList();
}
