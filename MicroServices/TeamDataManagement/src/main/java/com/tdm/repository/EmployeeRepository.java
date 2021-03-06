package com.tdm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tdm.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
