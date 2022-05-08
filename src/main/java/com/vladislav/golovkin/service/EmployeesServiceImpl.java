package com.vladislav.golovkin.service;

import com.vladislav.golovkin.dao.EmployeesDAO;
import com.vladislav.golovkin.entity.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeesServiceImpl implements EmployeesService{
    @Autowired
    private EmployeesDAO employeesDAO;
    @Override
    public List<Employees> getEmpList() {
        return employeesDAO.getEmpList();
    }

    @Override
    public Employees getEmp(int id) {
        return employeesDAO.getEmp(id);
    }

    @Override
    public void saveEmp(Employees employee) {
        employeesDAO.saveEmp(employee);
    }

    @Override
    public void deleteEmp(int id) {
        employeesDAO.deleteEmp(id);
    }
}
