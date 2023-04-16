package com.ganzymalgwi.employeesystemapi.services;


import com.ganzymalgwi.employeesystemapi.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();
}
