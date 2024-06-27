package com.disha.assignment2;
import java.util.Scanner;
// Class Commission with the specified data members and methods
public class Commission {
	// Data Members
	private String name;
	private String address;
	private String phone;
	private double salesAmount;
	
	// Method to accept details of the sales employee
	public void acceptDetails() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		name = scanner.nextLine();
		
		System.out.print("Enter address: ");
		address = scanner.nextLine();
		
		System.out.print("Enter phone: ");
		phone = scanner.nextLine();
		
		System.out.print("Enter sales amount: ");
		salesAmount = scanner.nextDouble();
		
		scanner.close();
	}
	// Method to calculate the commission
	public double calculateCommission() {
		double commission;
		if (salesAmount >= 200000) {
			commission = salesAmount * 0.20;
			
		} else if (salesAmount >= 60000) {
			commission = salesAmount * 0.06;
			
		} else if (salesAmount >= 40000) {
			commission = salesAmount * 0.04;
			
		} else {
			commission =0;
		}
		return commission;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Commission commissionEmployee = new Commission();
		commissionEmployee.acceptDetails();
		double commission = commissionEmployee.calculateCommission();
		System.out.println("Commission: " + commission);

	}

}
