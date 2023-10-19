package com.spring.boot.app.service;

import com.spring.boot.app.dao.EmployeeDAO;
import com.spring.boot.app.entity.Employee;
import com.spring.boot.app.service.dto.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public EmployeeDTO addEmployee(EmployeeDTO empFromRequest) {
        Employee emp = new Employee();
        emp.setEmpId(empFromRequest.getEmpId());
        emp.setEmpName(empFromRequest.getEmpName());
        emp.setEmpAddress(empFromRequest.getEmpAddress());
        emp.setEmpDept(empFromRequest.getEmpDept());
        emp.setEmpSal(empFromRequest.getEmpSal());

        employeeDAO.addEmployee(emp);

        return empFromRequest;
    }
}
