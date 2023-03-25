package com.codegym.Casestudy04.service;
import com.codegym.Casestudy04.dto.request.EmployeeRequestDto;
import com.codegym.Casestudy04.dto.response.EmployeeReponseDto;
import com.codegym.Casestudy04.entity.Employee;

import java.util.List;

public interface EmployeeService {

    //phần của bình
    void checkin(Long id);

    EmployeeReponseDto getEmployeeByUsername(String username);
//----
    List<EmployeeReponseDto> getEmployees();
    List<EmployeeReponseDto> getEmployeesByFullName(String fullName);

    void remove(Long id);
    EmployeeReponseDto getEmployeeById(Long userId);



    EmployeeReponseDto save(EmployeeRequestDto EmployeeDto);
}
