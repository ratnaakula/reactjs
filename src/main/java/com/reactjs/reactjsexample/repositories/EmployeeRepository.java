package com.reactjs.reactjsexample.repositories;

import com.reactjs.reactjsexample.entities.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

}
