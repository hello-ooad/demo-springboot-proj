package com.mumu.service;

import com.mumu.entity.Flighttable;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author mumu
 * @since 2023-10-05
 */
public interface FlighttableService extends IService<Flighttable> {

    List<Flighttable> selectList();
}
