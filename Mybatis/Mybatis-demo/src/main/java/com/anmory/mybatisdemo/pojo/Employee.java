package com.anmory.mybatisdemo.pojo;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-02-23 下午6:36
 */

public class Employee {

    private Integer empId;

    private String empName;

    private Double empSalary;

    //getter | setter

    public Double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }
}