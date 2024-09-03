package com.sriranjan.employee.repository;

import com.sriranjan.employee.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long>{

}
