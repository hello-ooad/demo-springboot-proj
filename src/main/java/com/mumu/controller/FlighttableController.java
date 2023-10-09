package com.mumu.controller;


import com.alibaba.fastjson2.JSON;
import com.mumu.entity.ConferenceRooms;
import com.mumu.entity.Flighttable;
import com.mumu.service.ConferenceRoomsService;
import com.mumu.service.FlighttableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author mumu
 * @since 2023-10-05
 */
@RestController
@RequestMapping("/flighttable")
public class FlighttableController {
    @Autowired
    FlighttableService service;
    @RequestMapping("/list")
    public String full_list() {
        return JSON.toJSONString(service.selectList());
    }
    @PostMapping("/save")
    public boolean save(Flighttable table){
        return service.save(table);
    }
    @PostMapping("/update")
    public boolean update(Flighttable table){
        return service.saveOrUpdate(table);
    }
}

