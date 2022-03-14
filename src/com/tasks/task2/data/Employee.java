package com.tasks.task2.data;

import java.util.List;

public class Employee {

    private String employeeId;
    private String employeeName;
    private double salary;
    private long locationId;
    private long deptId;
    private List<Long> benefitId;

    public void setBenefitId(List<Long> benefitId) {
        this.benefitId = benefitId;
    }



    public Employee() {

    }

    public Employee(String employeeId, String employeeName, double salary, long locationId, long deptId, List<Long> benefitId) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.locationId = locationId;
        this.deptId = deptId;
        this.benefitId = benefitId;
    }


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getLocationId() {
        return locationId;
    }

    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }

    public long getDeptId() {
        return deptId;
    }

    public void setDeptId(long deptId) {
        this.deptId = deptId;
    }

    public List<Long> getBenefitId() {
        return benefitId;
    }

    public void setBenefitId() {
        this.benefitId = benefitId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                ", locationId=" + locationId +
                ", deptId=" + deptId +
                ", benefitId=" + benefitId +
                '}';
    }
}
