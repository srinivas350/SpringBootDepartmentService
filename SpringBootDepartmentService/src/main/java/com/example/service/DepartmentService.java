package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.entity.Department;

@Service
public interface DepartmentService {
	
	public Department saveDepartment(Department emp);
	public List<Department> getAllDepartments();
	public Optional<Department> getDepartment(int empId);
	public List<Department> getDept(String dept);

}
