package com.thoughtworks.homework.Service;

import com.thoughtworks.homework.Api.EmployeeServiceApi;
import com.thoughtworks.homework.Dao.EmployeeRepository;
import com.thoughtworks.homework.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Employee update(Employee newEmployee) {
        if (newEmployee == null || newEmployee.getId() == null){
            return null;
        }
        Optional<Employee> optional = repository.findById(newEmployee.getId());
        if (optional.isPresent()) {
            Employee oldEmployee = optional.get();
            compare(oldEmployee, newEmployee);

            return repository.save(newEmployee);
        }
        return null;
    }

    private void compare(Employee oldEmployee, Employee newEmployee) {
        if (newEmployee.getName().isEmpty()) {
            newEmployee.setName(oldEmployee.getName());
        }
        if (newEmployee.getAge() == null){
            newEmployee.setAge(oldEmployee.getAge());
        }
        if (newEmployee.getGender().isEmpty()) {
            newEmployee.setGender(oldEmployee.getGender());
        }
    }

    @Override
    public String delete(Integer id) {
        repository.deleteById(id);
        Optional<Employee> optional = repository.findById(id);
        if (optional.isPresent()){
            return "删除失败";
        }
        return "删除成功";
    }
}
