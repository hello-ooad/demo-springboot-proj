package com.mumu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mumu.entity.Flighttable;
import com.mumu.mapper.FlighttableMapper;
import com.mumu.service.FlighttableService;
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
 * @since 2023-10-05
 */
@Service
public class FlighttableServiceImpl extends ServiceImpl<FlighttableMapper, Flighttable> implements FlighttableService {
@Autowired
    FlighttableMapper mapper;
    @Override
    public List<Flighttable> selectList() {
        QueryWrapper<Flighttable> queryWrapper = new QueryWrapper<>();
        return mapper.selectList(queryWrapper);
    }
}
