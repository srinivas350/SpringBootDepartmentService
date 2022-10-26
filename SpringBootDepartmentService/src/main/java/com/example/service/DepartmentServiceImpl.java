package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Department;
import com.example.repositories.DepartmentRepostiory;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	public DepartmentRepostiory repo;
	@Override
	public Department saveDepartment(Department emp) {
		
		Department Department=repo.save(emp);
		return Department;
	}

	@Override
	public List<Department> getAllDepartments() {
		List<Department> empList=repo.findAll();
		return empList;
	}

	@Override
	public Optional<Department> getDepartment(int empId) {
		Optional<Department> emp=repo.findById(empId);
		return emp;
	}
	
	@Override
	public List<Department> getDept(String dept) {
		List<Department> emp=repo.getDept(dept);
		return emp;
	}
	
	

}
