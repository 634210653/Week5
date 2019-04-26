package com.example.demo.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: LP
 * @Date: 2019/4/26
 */
public class Company {

    private HashMap<Integer,Employee> employees ;

    public Company(){

        employees = new  HashMap<Integer,Employee>();
        employees.put(0,new Employee(0,"小明",20,"男"));
        employees.put(1,new Employee(1,"小红",19,"女"));
        employees.put(2,new Employee(2,"小智",15,"男"));
        employees.put(3,new Employee(3,"小刚",16,"男"));
        employees.put(4,new Employee(4,"小霞",15,"女"));

    }
    public void addEmployees( Employee employee) {
       employees.put(employee.getId(),employee);
    }


    public HashMap<Integer,Employee> getEmployees() {
        return employees;
    }

}
