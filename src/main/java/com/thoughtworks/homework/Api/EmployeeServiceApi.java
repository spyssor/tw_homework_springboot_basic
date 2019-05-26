package com.thoughtworks.homework.Api;

import com.thoughtworks.homework.Entity.Employee;

import java.util.List;

public interface EmployeeServiceApi {

    Employee add(Employee employee);

    List<Employee> list();

    Employee query(Integer id);

    void delete(Integer id);
}
