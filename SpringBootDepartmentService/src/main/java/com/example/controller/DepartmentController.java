package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Department;
import com.example.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	DepartmentService deptService;

	@PostMapping("/saveDepartment")
	public ResponseEntity<Department> saveDepartment(@RequestBody Department department) {
		try {
			return new ResponseEntity<>(deptService.saveDepartment(department), HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/getAllDepartment")
	public ResponseEntity<List<Department>> getAllDepartments() {
		try {
			List<Department> list = deptService.getAllDepartments();

			if (list.isEmpty() || list.size() == 0) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(list, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/department/{id}")
	public ResponseEntity<Department> getDepartment(@PathVariable("id") int id) {
		Optional<Department> department = deptService.getDepartment(id);

		if (department.isPresent()) {
		}
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@GetMapping("/hello")
	public String hello()
	{
		return "Hello";
	}
	
	@GetMapping("/department/{dept}")
	public ResponseEntity<List<Department>> getDepts(@PathVariable("dept") String dept) {
		List<Department> department = deptService.getDept(dept);

		if (department.equals(null)) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<List<Department>>(department,HttpStatus.OK);
		
	}

}
