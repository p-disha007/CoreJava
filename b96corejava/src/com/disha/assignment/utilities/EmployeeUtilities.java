package com.disha.assignment.utilities;

import com.disha.assignment.employees.Employee;
import com.disha.assignment.employees.Manager;
import com.disha.assignment.employees.Developer;

public class EmployeeUtilities {
	public static void printEmployeeDetails(Employee employee) {
		System.out.println("Employee ID: " + employee.getEmployeeId());
		System.out.println("Name: " + employee.getName());
		System.out.println("Salary: " + employee.getSalary());
		
		if (employee instanceof Manager)  {
			Manager manager = (Manager) employee;
			System.out.println("Department: " + manager.getDepartment());
			
		} else if (employee instanceof Developer)  {
			Developer developer = (Developer) employee;
			System.out.println("Programming Language: " + developer.getProgrammingLanguage());
			
		}
	}
	
	
	public static void increaseSalary(Employee employee, double increment)  {
		double newSalary = employee.getSalary() * (1 + increment / 100);
		employee.setSalary(newSalary);
	}
}
