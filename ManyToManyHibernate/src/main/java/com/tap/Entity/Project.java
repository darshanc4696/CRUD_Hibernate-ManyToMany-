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
@Table(name = "project")
public class Project 
{
	@Id
	@Column(name = "proj_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int proj_id;
	@Column(name = "projectName")
	private String projectName;
	@Column(name = "budget")
	private float budget;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "emp_proj" , joinColumns = @JoinColumn(name = "project_id"), inverseJoinColumns = @JoinColumn(name = "employee_id"))
	private List<Employee> emp;
	
	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

	public Project() {
		super();
	}

	public Project(int proj_id, String projectName, float budget) {
		super();
		this.proj_id = proj_id;
		this.projectName = projectName;
		this.budget = budget;
	}

	public Project(String projectName, float budget) {
		super();
		this.projectName = projectName;
		this.budget = budget;
	}

	public int getProj_id() {
		return proj_id;
	}

	public void setProj_id(int proj_id) {
		this.proj_id = proj_id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public float getBudget() {
		return budget;
	}

	public void setBudget(float budget) {
		this.budget = budget;
	}

	@Override
	public String toString() {
		return "Project [proj_id=" + proj_id + ", projectName=" + projectName + ", budget=" + budget + "]";
	}
}
