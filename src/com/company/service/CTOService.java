package com.company.service;

import com.company.model.Employee;
import com.company.repository.EmployeeRepository;

public class CTOService {
    private EmployeeRepository employeeRepository;

    void save(Employee employee) {
        employeeRepository.save(employee);
    }
}
