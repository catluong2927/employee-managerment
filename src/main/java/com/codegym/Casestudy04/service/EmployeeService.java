package com.codegym.Casestudy04.service;
import com.codegym.Casestudy04.dto.request.EmployeeRequestDto;
import com.codegym.Casestudy04.dto.response.EmployeeReponseDto;

import java.util.List;

public interface EmployeeService {
    List<EmployeeReponseDto> getEmployees();
    List<EmployeeReponseDto> getEmployeesByFullName(String fullName);
    EmployeeReponseDto getEmployeeByUsername(String username);
    void remove(Long id);
    EmployeeReponseDto getEmployeeById(Long userId);

    EmployeeReponseDto save(EmployeeRequestDto EmployeeDto);
}
