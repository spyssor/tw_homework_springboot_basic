package com.thoughtworks.homework.Service;

import com.thoughtworks.homework.Api.EmployeeServiceApi;
import com.thoughtworks.homework.Dao.EmployeeRepository;
import com.thoughtworks.homework.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeServiceApi {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public Employee add(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public List<Employee> list() {
        return repository.findAll();
    }

    @Override
    public Employee query(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
