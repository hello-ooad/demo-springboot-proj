package com.mumu.controller;


import com.alibaba.fastjson2.JSON;
import com.mumu.entity.ConferenceRooms;
import com.mumu.entity.User;
import com.mumu.service.ConferenceRoomsService;
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
 * @since 2023-09-24
 */
@RestController
@RequestMapping("/conferencerooms")
public class ConferenceRoomsController {
    @Autowired
    ConferenceRoomsService service;

    @PostMapping("/list")
    public String list(ConferenceRooms room) {
        return JSON.toJSONString(service.selectList(room));
    }
    @RequestMapping("/all")
    public String all() {
        return list(new ConferenceRooms());
    }
    @PostMapping("/new")
    public boolean add_user(ConferenceRooms room){
        return service.saveOrUpdate(room);
    }
    @RequestMapping("/delete")
    public int delete(ConferenceRooms room){
        return service.deleteRoom(room);
    }
}

