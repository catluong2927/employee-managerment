package com.codegym.Casestudy04.service.impl;

import com.codegym.Casestudy04.dto.request.EmployeeRequestDto;
import com.codegym.Casestudy04.dto.response.EmployeeReponseDto;
import com.codegym.Casestudy04.entity.Employee;
import com.codegym.Casestudy04.mapper.EmployeeMapper;
import com.codegym.Casestudy04.repository.EmployeeRepository;
import com.codegym.Casestudy04.service.EmployeeService;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepo;

    private final EmployeeMapper employeeMapper;

    @Override
    public List<EmployeeReponseDto> getEmployees() {
        return employeeMapper.EntitiesTransToDtos(employeeRepo.findAll());
    }

    @Override
    public List<EmployeeReponseDto> getEmployeesByStatus() {
        return employeeMapper.EntitiesTransToDtos(employeeRepo.findEmployeeByStatus());
    }

    @Override
    public EmployeeReponseDto getEmployeeById(Long userId) {
        return employeeMapper.EntityTransToDto(employeeRepo.getById(userId));
    }

    @Override
    public EmployeeReponseDto updateEmployee(Long id, EmployeeRequestDto employeeRequestDto) {
        Employee employee = employeeRepo.getById(id);
        BeanUtils.copyProperties(employeeRequestDto,employee);
        employeeRepo.save(employee);
        return employeeMapper.EntityTransToDto(employee);
    }

    @Override
    public EmployeeReponseDto getEmployeeByName(String name) {
        return employeeMapper.EntityTransToDto(employeeRepo.findEmployeeByName(name));
    }

    @Override
    public void remove(Long id) {
        employeeRepo.deleteByIdEmployee(id);
    }

    @Override
    public List<EmployeeReponseDto> getEmployeesByFullName(String fullName) {
        return null;
    }

    @Override
    public EmployeeReponseDto getEmployeeByUsername(String username) {
        return null;
    }

    @Override
    public EmployeeReponseDto save(EmployeeRequestDto employeeDto) {
        Employee employee = employeeMapper.DtoTransToEntity(employeeDto);
        employeeRepo.save(employee);
        EmployeeReponseDto employeeReponseDto = employeeMapper.EntityTransToDto(employee);
        return employeeReponseDto;
    }
}
