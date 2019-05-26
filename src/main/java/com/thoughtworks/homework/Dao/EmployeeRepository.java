package com.thoughtworks.homework.Dao;

import com.thoughtworks.homework.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
