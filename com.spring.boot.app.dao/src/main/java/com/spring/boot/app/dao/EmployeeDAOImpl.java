package com.spring.boot.app.dao;

import com.spring.boot.app.entity.Employee;
import com.spring.boot.app.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
    @Autowired
    private EmployeeRepository employRepository;

    @Override
    public Employee addEmployee(Employee emp) {
        return employRepository.save(emp);
    }
}
