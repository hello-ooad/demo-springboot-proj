package com.mumu.controller;


import com.alibaba.fastjson2.JSON;
import com.mumu.entity.User;
import com.mumu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public String full_list() {
        return JSON.toJSONString(service.selectList());
    }

    @PostMapping("/new")
    public boolean add_user(User user) {
        return service.saveOrUpdate(user);
    }

    @PostMapping("/signin")
    public String login(User user) {
        if (!service.isusernameExists(user.getUserName())) {
            return "用户名不存在";
        } else if (!service.isusernameExists(user.getUserName(), user.getUserPassword())) {
            return "用户名或密码错误";
        } else {
            return "success!";
        }
    }

    @PostMapping("/username")
    public String name(User user) {
        if (!service.isusernameExists(user.getUserName())) {
            return "用户名不存在";
        } else {
            return "success!";
        }
    }
}

