package com.employee_service.employee.controller;

import com.employee_service.employee.entity.Employee;
import com.employee_service.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping()
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/get")
    public String name(){
        return "hello";
    }

    @GetMapping("employee/{empId}")
    public List<Employee> getEmployees(@PathVariable("empId") Long mId){
        return this.employeeService.getEmp(mId);
    }
}
