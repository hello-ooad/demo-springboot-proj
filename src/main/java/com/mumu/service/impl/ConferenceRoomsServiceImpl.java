package com.mumu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mumu.entity.ConferenceRooms;
import com.mumu.mapper.ConferenceRoomsMapper;
import com.mumu.service.ConferenceRoomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author mumu
 * @since 2023-09-24
 */
@Service
public class ConferenceRoomsServiceImpl extends ServiceImpl<ConferenceRoomsMapper, ConferenceRooms> implements ConferenceRoomsService {
    @Autowired
    ConferenceRoomsMapper mapper;
    @Override
    public List<ConferenceRooms> selectList(ConferenceRooms Room){
        QueryWrapper<ConferenceRooms> queryWrapper=new QueryWrapper<>();
        queryWrapper.lambda().eq(Room.getRoomId()!=null,ConferenceRooms::getRoomId,Room.getRoomId())
                .eq(Room.getDepartment()!=null,ConferenceRooms::getDepartment,Room.getDepartment())
                .eq(Room.getRoomName()!=null,ConferenceRooms::getRoomName,Room.getRoomName())
                .eq(Room.getType()!=null,ConferenceRooms::getType,Room.getType())
                .eq(Room.getLocation()!=null,ConferenceRooms::getLocation,Room.getLocation())
                .eq(Room.getDate()!=null,ConferenceRooms::getDate,Room.getDate())
                .eq(Room.getStartTime()!=null,ConferenceRooms::getStartTime,Room.getStartTime())
                .eq(Room.getEndTime()!=null,ConferenceRooms::getEndTime,Room.getEndTime())
                .eq(Room.getMaxDuration()!=null,ConferenceRooms::getMaxDuration,Room.getMaxDuration());
        return mapper.selectList(queryWrapper);
    }

}
