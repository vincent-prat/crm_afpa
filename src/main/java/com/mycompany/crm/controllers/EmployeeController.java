package com.mycompany.crm.controllers;

import com.mycompany.crm.entities.Employee;
import com.mycompany.crm.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public Iterable<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

    @GetMapping("/employees/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Integer id){
        return employeeService.getEmployee(id);
    }
}
