package com.thoughtworks.homework.Controller;

import com.thoughtworks.homework.Entity.Employee;
import com.thoughtworks.homework.Service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/add")
    public Employee add(Employee employee){
        return employeeService.add(employee);
    }

    @GetMapping("/search/{id}")
    public Employee query(@PathVariable("id") Integer id){
        return employeeService.query(id);
    }




}
