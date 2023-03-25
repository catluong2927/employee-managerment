package com.codegym.Casestudy04.repository;
import com.codegym.Casestudy04.dto.response.EmployeeReponseDto;
import com.codegym.Casestudy04.entity.Employee;
import com.codegym.Casestudy04.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Modifying
    @Query( value = "UPDATE Employee e SET e.isStatus = false WHERE e.id = :id")
    void deleteByIdEmployee(@Param("id") Long id);


    @Query("FROM Employee WHERE isStatus = true")
    List<Employee> findEmployeeByStatus();

    @Query("FROM Employee e WHERE e.name = :name")
    Employee findEmployeeByName(String name);


    @Modifying
    @Query(value = "UPDATE Employee e SET e.checkIn = e.checkIn + 1 WHERE e.id = :id")
    void checkIn(@Param("id")Long id);

    @Query( value = "from Employee e WHERE e.username like %:username%")
    Employee findByUsername(@Param("username") String username);

}
