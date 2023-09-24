package com.mumu.controller;


import com.alibaba.fastjson2.JSON;
import com.mumu.entity.User;
import com.mumu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author mumu
 * @since 2023-09-22
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService service;

    @RequestMapping("/list")
    public String full_list() throws IOException {
        List<User> userList=service.selectList();

        return JSON.toJSONString(userList);
    }

    @PostMapping("/new")
    public boolean add_user(User user){
        service.saveOrUpdate(user);
        return true;
    }
}

