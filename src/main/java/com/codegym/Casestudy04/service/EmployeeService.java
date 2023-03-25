package com.codegym.Casestudy04.service;
import com.codegym.Casestudy04.dto.request.EmployeeRequestDto;
import com.codegym.Casestudy04.dto.response.EmployeeReponseDto;
import com.codegym.Casestudy04.entity.Employee;

import java.util.List;

public interface EmployeeService {

    
    void checkin(Long id);


    List<EmployeeReponseDto> getEmployees();

    List<EmployeeReponseDto> getEmployeesByStatus();

    List<EmployeeReponseDto> getEmployeesByFullName(String fullName);


    EmployeeReponseDto getEmployeeByUsername(String username);


    void remove(Long id);

    EmployeeReponseDto getEmployeeById(Long userId);


    EmployeeReponseDto updateEmployee(Long id, EmployeeRequestDto employeeRequestDto);

    EmployeeReponseDto getEmployeeByName(String name);

    EmployeeReponseDto save(EmployeeRequestDto employeeDto);


}
