package com.codegym.Casestudy04.dto.response;

import com.codegym.Casestudy04.entity.Department;
import com.codegym.Casestudy04.entity.Role;
import lombok.Data;

import java.util.Date;

@Data
public class EmployeeReponseDto {

    private Long id;

    private String name;

    private String email;

    private String address;

    private Date birth ;
    private Department department;

    private String job;

    private boolean isStatus;

}
