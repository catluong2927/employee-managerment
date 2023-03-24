package com.codegym.Casestudy04.controller;

import com.codegym.Casestudy04.dto.response.EmployeeReponseDto;
import com.codegym.Casestudy04.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping()
    public List<EmployeeReponseDto> getAllEmployees(){
        return employeeService.getEmployees();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeReponseDto> getEmployee(@PathVariable("id") Long id){
        EmployeeReponseDto employee = employeeService.getEmployeeById(id);

        if (employee == null) {
            return new ResponseEntity<EmployeeReponseDto>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> removeEmployee(@PathVariable("id") Long id) {
        EmployeeReponseDto employee = employeeService.getEmployeeById(id);
        if (employee == null) {
            return new ResponseEntity<EmployeeReponseDto>(HttpStatus.NOT_FOUND);
        } else {
            employeeService.remove(id);
            return new ResponseEntity<>(employee, HttpStatus.OK);
        }
    }
}
