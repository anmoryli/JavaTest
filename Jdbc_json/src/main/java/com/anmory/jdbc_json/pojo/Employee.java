package com.anmory.jdbc_json.pojo;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-02-23 下午7:22
 */

public class Employee {
    private Integer empId;

    private String empName;

    private Double empSalary;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }
}
