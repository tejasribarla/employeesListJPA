/*
 * You can use the following import statements
 *
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 */
// Write your code here

package com.example.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.employee.service.EmployeeJpaService;
import com.example.employee.model.Employee;

import java.util.*;

@RestController
public class EmployeeController {

    @Autowired
    public EmployeeJpaService employeeService;

    @GetMapping("/employees")
    public ArrayList <Employee>getEmployees() {
        return employeeService.getEmployees();
    }
    @GetMapping("/employees/{employeeId}")
    public Employee getEmployeeById(@PathVariable ("employeeId") int employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }
    @PostMapping("/employees")    
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }
    @PutMapping("/employees/{employeeId}")
    public Employee updateEmployee(@PathVariable ("employeeId") int employeeId,@RequestBody Employee employee) {
        return employeeService.updateEmployee(employeeId, employee);
    }
    
    @DeleteMapping("/employees/{employeeId}")
    public void deleteEmployeeById(@PathVariable ("employeeId") int employeeId) {
        employeeService.deleteEmployeeById(employeeId);
    }
}

