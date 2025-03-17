package com.anmory.jdbc_json.service;

import com.anmory.jdbc_json.pojo.Employee;
import com.anmory.jdbc_json.util.JdbcUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-02-23 下午7:25
 */

@Service
public class EmployeeService {
    List<Employee> employees = JdbcUtil.getAllEmployees();
    public String data() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(employees);
        return json;
    }
}
