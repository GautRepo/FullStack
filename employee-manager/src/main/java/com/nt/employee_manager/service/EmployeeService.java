package com.nt.employee_manager.service;


import com.nt.employee_manager.model.Employee;
import com.nt.employee_manager.model.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo repo;


    // Get all employees
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    // Get employee by ID
    public Optional<Employee> getEmployeeById(Integer id) {
        return repo.findById(id);

    }

    // Create or update employee
    public Employee saveEmployee(Employee employee) {
        repo.save(employee);
        return employee;
    }

    // Delete employee by ID
    public void deleteEmployee(Integer id) {
        repo.deleteById(id);
    }
}
