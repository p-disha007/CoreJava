package com.disha.assignment;
import com.disha.assignment.employees.Manager;
import com.disha.assignment.employees.Developer;
import com.disha.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager();
		manager.setEmployeeId(202);
		manager.setName("Jasper");
		manager.setSalary(70000);
		manager.setDepartment("AI");
		
		Developer developer = new Developer();
		developer.setEmployeeId(302);
		developer.setName("Edward");
		developer.setSalary(80000);
		developer.setProgrammingLanguage("Python");
		
		
		System.out.println("Before salary increment:");
		com.disha.assignment.utilities.EmployeeUtilities.printEmployeeDetails(manager);
		com.disha.assignment.utilities.EmployeeUtilities.printEmployeeDetails(developer);
		
		
		com.disha.assignment.utilities.EmployeeUtilities.increaseSalary(manager,  20);
		com.disha.assignment.utilities.EmployeeUtilities.increaseSalary(developer,  30);
		
		System.out.println("\nAfter salary increment:");
		com.disha.assignment.utilities.EmployeeUtilities.printEmployeeDetails(manager);
		com.disha.assignment.utilities.EmployeeUtilities.printEmployeeDetails(developer);
		

	}

}
