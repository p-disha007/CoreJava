package com.tns.collections;

import java.util.Scanner;

public class Find_Factorial4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
				//create a scanner object
				System.out.println("Enter a number for find factorial");
		        int num=scan.nextInt(); //get input from user
		        
		        //Lambda expression to calculate factorial
		        Factorial factorial= (n)->{
		        	int f=1;
		        	for (int i=1;i<=n;i++) {
		        		f=f*i;
		        	}
		        	return f;
		        };
		        
		        int result=factorial.cal(num);
		
		
		System.out.print("Factorial of the "+num+"is "+result);
	}

}
