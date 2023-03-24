package com.codegym.Casestudy04.dto.request;

import com.codegym.Casestudy04.entity.Department;
import lombok.Data;
import java.util.Date;

@Data
public class EmployeeRequestDto {

    private Long id;

    private String name;

    private String email;

    private String phone;

    private String address;

    private Date birth;

    private String username;

    private String password;

    private boolean gender;

    private Department department;

    private String job;

    private double salary;

    private Long checkIn;

    private Long roleId;

    private boolean isStatus;
}
