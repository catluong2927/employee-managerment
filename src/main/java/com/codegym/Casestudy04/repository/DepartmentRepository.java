package com.codegym.Casestudy04.repository;

import com.codegym.Casestudy04.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department findByName(String name);


}
