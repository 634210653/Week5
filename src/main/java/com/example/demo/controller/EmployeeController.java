package com.example.demo.controller;

import com.example.demo.model.Company;
import com.example.demo.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: LP
 * @Date: 2019/4/26
 */
@RestController
public class EmployeeController {
    Company company = new Company();

    @RequestMapping(value = "/employees",method = RequestMethod.GET)
    public ResponseEntity<Object> getEmployees(){
        return  new ResponseEntity<>(company.getEmployees().values(), HttpStatus.OK);
    }

    @RequestMapping(value = "/employees/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteEmployee(@PathVariable("id") int id) {

        company.getEmployees().remove(id);
        return new ResponseEntity<>("Employee is deleted successsfully", HttpStatus.OK);
    }
    @RequestMapping(value = "/employees/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateProduct(@PathVariable("id") int id, @RequestBody Employee employee) {
        company.addEmployees(employee);
        return new ResponseEntity<>("Employee is updated successsfully", HttpStatus.OK);
    }

    @RequestMapping(value = "/employees", method = RequestMethod.POST)
    public ResponseEntity<Object> createEmployee(@RequestBody Employee employee ) {
        company.addEmployees(employee);
        return new ResponseEntity<>("Employee is created successfully", HttpStatus.CREATED);
    }
}
