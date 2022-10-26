package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table

public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int deptId;
	@Column(name="DeptName")
	private String deptName;
	@Column(name="EmployeeCount")
	private int employeeCount;
	
	
	public Department(int deptId, String deptName, int employeeCount) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.employeeCount = employeeCount;
	}


	public int getDeptId() {
		return deptId;
	}


	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public int getEmployeeCount() {
		return employeeCount;
	}


	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}


	public Department() {}
	

}
