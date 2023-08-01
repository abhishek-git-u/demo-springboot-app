package com.practice.swagger.implementation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.swagger.implementation.model.Employee;

@RestController
@RequestMapping()
public class EmployeeController {
    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John Doe"));
        employees.add(new Employee(2, "Jane Smith"));
        employees.add(new Employee(3, "Bob Johnson"));
        return employees;
    }
}
