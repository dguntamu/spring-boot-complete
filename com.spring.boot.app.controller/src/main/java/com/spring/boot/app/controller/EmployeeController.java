package com.spring.boot.app.controller;

import com.spring.boot.app.service.EmployeeService;
import com.spring.boot.app.service.dto.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/emp")
    public ResponseEntity<EmployeeDTO> addEmployee(@RequestBody EmployeeDTO emp){
        EmployeeDTO addedEmp = employeeService.addEmployee(emp);
        return ResponseEntity.status(HttpStatus.OK).body(addedEmp);
    }

}
