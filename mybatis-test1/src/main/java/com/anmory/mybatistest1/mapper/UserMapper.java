package com.anmory.mybatistest1.mapper;

import com.anmory.mybatistest1.model.User;
import org.apache.ibatis.annotations.*;

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

    @Select("select * from user_info where username = #{name}")
    List<User> selectByName(String name);

    @Insert("insert into user_info (username, password) values (#{username},#{password})")
    Integer insertUser(String username,String password);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into user_info (username, password) VALUES (#{user.username}, #{user.password})")
    Integer insertUser2(@Param("user") User user);

    @Delete("delete from user_info where id = #{user.id}")
    void deleteUser(@Param("user") User user);

    @Update("update user_info set username = #{user.username},password = #{user.password} where id = #{user.id}")
    void updateUser(@Param("user") User user);

    List<User> selectAllXml();

    Integer insertXml(@Param("user") User user);

    void deleteXml(@Param("user") User user);

}
