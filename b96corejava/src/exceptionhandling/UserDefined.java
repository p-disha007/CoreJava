package exceptionhandling;

import java.util.Scanner;

public class UserDefined {
	private static int age;
	
	static void validate() throws Age {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the age");
		age=sc.nextInt();
		if(age<18) {
			throw new Age("invalid age");
		}
		else {
			System.out.println("valid age");
			
		}
		
	}
	

}
