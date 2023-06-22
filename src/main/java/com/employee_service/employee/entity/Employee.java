package com.employee_service.employee.entity;

public class Employee {
    private long EmpId;
    private String name;
    private String mailId;
    private long managerId;

    public Employee(long empId, String name, String mailId, long managerId) {
        EmpId = empId;
        this.name = name;
        this.mailId = mailId;
        this.managerId = managerId;
    }

    public Employee() {
    }

    public long getEmpId() {
        return EmpId;
    }

    public void setEmpId(long empId) {
        EmpId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public long getManagerId() {
        return managerId;
    }

    public void setManagerId(long managerId) {
        this.managerId = managerId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmpId=" + EmpId +
                ", name='" + name + '\'' +
                ", mailId='" + mailId + '\'' +
                ", managerId=" + managerId +
                '}';
    }

}
