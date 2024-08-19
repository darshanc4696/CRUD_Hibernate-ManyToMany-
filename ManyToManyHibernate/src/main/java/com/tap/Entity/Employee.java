package com.tap.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee 
{
	@Id
	@Column(name = "empid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int emp_id;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "emp_proj", joinColumns = @JoinColumn(name = "employee_id"), inverseJoinColumns = @JoinColumn(name = "project_id"))
	private List<Project> project;
	
	
	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

	public Employee() {
		super();
	}

	public Employee(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public Employee(int emp_id, String name, String email) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.email = email;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", email=" + email + "]";
	}

}
