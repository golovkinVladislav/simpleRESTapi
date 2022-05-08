package com.vladislav.golovkin.dao;


import com.vladislav.golovkin.entity.Employees;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Repository
public class EmployeesDAOImpl implements EmployeesDAO {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Employees> getEmpList() {
        Session session = sessionFactory.getCurrentSession();
        List<Employees> employeesList = session.createQuery("from Employees", Employees.class).getResultList();
        return employeesList;
    }

    @Override
    public Employees getEmp(int id) {
        Session session = sessionFactory.getCurrentSession();
        Employees employees = session.get(Employees.class,id);
        return employees;
    }

    @Override
    public void saveEmp(Employees employee) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(employee);
    }

    @Override
    public void deleteEmp(int id) {
        Session session = sessionFactory.getCurrentSession();
        Employees employees = session.get(Employees.class,id);
        session.delete(employees);
    }

}
