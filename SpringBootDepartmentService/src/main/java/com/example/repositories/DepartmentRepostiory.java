package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.Department;
@Repository
public interface DepartmentRepostiory extends JpaRepository<Department , Integer> {
	
	@Query(value="Select * from department where departmentName= ?1", nativeQuery = true)
	public List<Department> getDept(String dept);

}
