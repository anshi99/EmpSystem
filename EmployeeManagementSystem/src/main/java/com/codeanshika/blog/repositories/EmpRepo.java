package com.codeanshika.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codeanshika.blog.entities.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer>{

}
