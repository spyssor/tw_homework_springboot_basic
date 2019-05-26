package com.thoughtworks.homework.Controller;

import com.thoughtworks.homework.Entity.Employee;
import com.thoughtworks.homework.Service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeService;

    @GetMapping
    public List<Employee> list(){
        return employeeService.list();
    }
}