package com.mumu.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mumu.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author mumu
 * @since 2023-09-22
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
    List<User> selectList();

}
