package com.anmory.mybatisdemo.mapper;

import com.anmory.mybatisdemo.pojo.Employee;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-02-23 下午6:37
 */
public interface EmployeeMapper {
    @Select("SELECT * FROM t_emp")
    List<User> findAllUsers();
}
