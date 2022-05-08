package com.vladislav.golovkin.MyController;


import com.vladislav.golovkin.entity.Employees;
import com.vladislav.golovkin.exceptionHandling.EmployeeException;
import com.vladislav.golovkin.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {
    @Autowired
    private EmployeesService EmployeesService;
    @GetMapping("/emp")
    public List<Employees> getEmpList(){
     List<Employees> employeesList =  EmployeesService.getEmpList();
     return employeesList;
    }
    @GetMapping("/emp/{id}")
    public Employees getEmp(@PathVariable int id){
        Employees employees = EmployeesService.getEmp(id);
        if(employees==null){
            throw new EmployeeException("There is no employee with ID = " +
                    " " + id + " in Database");
        }
        return employees;
    }
    @PostMapping("/emp")
    public Employees addEmp(@RequestBody Employees employee){
        EmployeesService.saveEmp(employee);
        return employee;
    }
    @DeleteMapping("/emp/{id}")
    public String deleteEmp(@PathVariable int id){
        Employees employees = EmployeesService.getEmp(id);
        if(employees==null){
            throw new EmployeeException("There is no such employee");
        }
        EmployeesService.deleteEmp(id);
        return "employee with ID =  " + id + " has been removed";
    }



}
