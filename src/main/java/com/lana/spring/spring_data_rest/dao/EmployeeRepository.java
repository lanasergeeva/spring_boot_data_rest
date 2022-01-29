package com.lana.spring.spring_data_rest.dao;


import com.lana.spring.spring_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository
        extends JpaRepository<Employee, Integer> {

}
