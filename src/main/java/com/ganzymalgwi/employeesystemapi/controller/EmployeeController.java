package com.ganzymalgwi.employeesystemapi.controller;

import com.ganzymalgwi.employeesystemapi.model.Employee;
import com.ganzymalgwi.employeesystemapi.services.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody  Employee employee){
        return employeeService.createEmployee(employee);

    }
}

