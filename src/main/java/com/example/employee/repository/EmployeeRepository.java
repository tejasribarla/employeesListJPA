// Write your code here

package com.example.employee.repository;

import java.util.*;
import com.example.employee.model.Employee;

public interface EmployeeRepository {
    ArrayList <Employee> getEmployees();
    Employee addEmployee(Employee employee);
    Employee updateEmployee(int employeeId,Employee employee);
    Employee getEmployeeById(int employeeId);
    void deleteEmployeeById(int employeeId);
}

