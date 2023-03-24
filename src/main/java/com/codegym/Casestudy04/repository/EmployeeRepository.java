package com.codegym.Casestudy04.repository;
import com.codegym.Casestudy04.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findByUsername(String Username);
    @Query(nativeQuery = true, value = "UPDATE EMPLOYEES SET EMPLOYEES.isStatus = 0 WHERE id = :id;")
    void deleteByIdEmployee(@Param("id") Long id);
}
