package com.spring.boot.app.service.dto;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
    private Integer empId;
    private String empName;
    private String empSal;
    private Integer empDept;
    private String empAddress;

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSal=" + empSal +
                ", deptId=" + empDept +
                ", empAddress='" + empAddress + '\'' +
                '}';
    }
}
