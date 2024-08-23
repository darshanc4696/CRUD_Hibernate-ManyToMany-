package com.tap.main;

import java.util.ArrayList;

import com.tap.Entity.Employee;
import com.tap.Entity.Project;
import com.tap.Manager.HibernateManager;

public class Launch 
 {

	public static void main(String[] args) 
	{
		HibernateManager hibMan = new HibernateManager();
		
		Employee employee1 = new Employee("Darshan", "darshanc4696@gmail.com");
		Employee employee2 = new Employee("Indresh", "indresh@gmail.com");
		Employee employee3 = new Employee("Chandru", "chandru@gmail.com");
		
		Project project1 = new Project("Video Editing", 400000);
		Project project2 = new Project("Image Processing", 700000);
		
		ArrayList<Project> projectList1 = new ArrayList<Project>();
		projectList1.add(project1);
		
		ArrayList<Project> projectList2 = new ArrayList<Project>();
		projectList2.add(project1);
		projectList2.add(project2);

		ArrayList<Employee> empList1 = new ArrayList<Employee>();
		empList1.add(employee1);
		empList1.add(employee2);
		empList1.add(employee3);
		
		ArrayList<Employee> empList2 = new ArrayList<Employee>();
		empList2.add(employee2);
		empList2.add(employee3);
		
		employee1.setProject(projectList1);
		employee2.setProject(projectList2);
		employee3.setProject(projectList2);
//		
//		project1.setEmp(empList1);
//		project2.setEmp(empList2);
		
		hibMan.add(employee1);
		hibMan.add(employee2);
		hibMan.add(employee3);
		
		System.out.println("Done");
	}
}
