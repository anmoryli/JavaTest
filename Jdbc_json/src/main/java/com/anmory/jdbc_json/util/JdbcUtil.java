package com.anmory.jdbc_json.util;

import com.anmory.jdbc_json.pojo.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-02-23 下午7:21
 */

public class JdbcUtil {
    // 数据库连接信息
    private static final String URL = "jdbc:mysql://localhost:3306/mybatis-example";
    private static final String USER = "root";
    private static final String PASSWORD = "lmjnb666";

    // 获取数据库连接
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT emp_id, emp_name, emp_salary FROM t_emp";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                Employee emp = new Employee();
                emp.setEmpId(rs.getInt("emp_id"));
                emp.setEmpName(rs.getString("emp_name"));
                emp.setEmpSalary(rs.getDouble("emp_salary"));
                employees.add(emp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }
}
