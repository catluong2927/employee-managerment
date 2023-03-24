package com.codegym.Casestudy04.entity;

import lombok.*;

import javax.persistence.*;
import java.time.Year;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone",length = 10, nullable = false)
    private String phone;

    @Column(name = "address", length = 200, nullable = false)
    private String address;

    @Column(name = "birth", length = 200, nullable = false)
    private Date birth;

    @Column(name = "username", length = 200, nullable = false)
    private String username;

    @Column(name = "password", length = 200, nullable = false)
    private String password;

    @Column(name = "gender", nullable = false)
    private boolean gender;

    @ManyToOne(targetEntity = Department.class)
    @JoinColumn(name = "department_id", referencedColumnName = "id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Department department;

    @Column(name = "job")
    private String job;

    @Column(name = "salary")
    private double salary;

    @Column(name = "check_in")
    private Long checkIn;

    @Column(name = "role_id", nullable = false)
    private Long roleId;

    @Column(name = "isStatus", nullable = false)
    private boolean isStatus;
}
