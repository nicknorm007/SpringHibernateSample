package com.nicksoddsandends.service.impl;

import com.nicksoddsandends.dao.EmployeeDAO;
import com.nicksoddsandends.entity.Employee;
import com.nicksoddsandends.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/**
 * @author
 * @version 1.0
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    
    public EmployeeServiceImpl() {
        System.out.println("EmployeeServiceImpl()");
    }
    
    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeDAO.createEmployee(employee);
    }
    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeDAO.updateEmployee(employee);
    }
    @Override
    public void deleteEmployee(long id) {
        employeeDAO.deleteEmployee(id);
    }
    @Override
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }
    @Override
    public Employee getEmployee(long id) {
        return employeeDAO.getEmployee(id);
    }    
    @Override
    public List<Employee> getAllEmployees(String employeeName) {
        return employeeDAO.getAllEmployees(employeeName);
    }
}
