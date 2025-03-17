package com.anmory.jdbc_json.controller;

import com.anmory.jdbc_json.service.EmployeeService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-02-23 下午7:32
 */

@RequestMapping("/emp")
@RestController
public class EmployeeController {
    @RequestMapping("/getList")
    public String getList() throws JsonProcessingException {
        EmployeeService employeeService = new EmployeeService();
        return employeeService.data();
    }
}
