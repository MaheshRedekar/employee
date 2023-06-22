package com.employee_service.employee.service;

import com.employee_service.employee.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceImpl implements EmployeeService {
    List<Employee> employees = List.of(
            new Employee(10L, "mahesh", "mahesh@gmail.com", 100L),
            new Employee(11L, "suraj", "suraj@gmail.com", 101L),
            new Employee(12L, "lokesh", "lokesh@gmail.com", 101L),
            new Employee(13L, "amol", "amol@gmail.com", 102L)
    );


    @Override
    public List<Employee> getEmp(Long mId) {
       // return employees;
       return employees.stream().filter(employee -> employee.getManagerId()==mId).collect(Collectors.toList());
    }
}
