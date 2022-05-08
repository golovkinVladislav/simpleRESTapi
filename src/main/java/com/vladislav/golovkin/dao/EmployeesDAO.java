package com.vladislav.golovkin.dao;



import com.vladislav.golovkin.entity.Employees;

import java.util.List;

public interface EmployeesDAO {
    List<Employees> getEmpList();
    Employees getEmp(int id);
    void saveEmp(Employees employee);
    void deleteEmp(int id);
}
