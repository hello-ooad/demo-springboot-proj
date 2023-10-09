package com.mumu.service;

import com.mumu.entity.ConferenceRooms;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author mumu
 * @since 2023-09-24
 */
public interface ConferenceRoomsService extends IService<ConferenceRooms> {

    List<ConferenceRooms> selectList(ConferenceRooms Room);

    int deleteRoom(ConferenceRooms Room);
}
