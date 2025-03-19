package com.anmory.mybatistest1.mapper;

import com.anmory.mybatistest1.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-03-19 上午8:03
 */

@Mapper
public interface UserMapper {
    @Select("select * from user_info")
    List<User> selectAll();
}
