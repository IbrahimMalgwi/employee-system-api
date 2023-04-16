package com.ganzymalgwi.employeesystemapi.repository;

import com.ganzymalgwi.employeesystemapi.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

}
