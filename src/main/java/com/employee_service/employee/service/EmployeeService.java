package com.employee_service.employee.service;

import com.employee_service.employee.entity.Employee;

import java.util.List;

public interface EmployeeService {

   public List<Employee> getEmp(Long mId);
}
