package com.mycompany.crm.services;

import com.mycompany.crm.entities.Brand;
import com.mycompany.crm.entities.Employee;
import com.mycompany.crm.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Iterable<Employee> getEmployees(){
        return employeeRepository.findAll();
    }
    public Optional<Employee> getEmployee(final Integer id) {
        return employeeRepository.findById(id);
    }
}
