package com.vladislav.golovkin.service;



import com.vladislav.golovkin.entity.Employees;

import java.util.List;

public interface EmployeesService {
    List<Employees> getEmpList();
    Employees getEmp(int id);
    void saveEmp(Employees employee);
    void deleteEmp(int id);
}
