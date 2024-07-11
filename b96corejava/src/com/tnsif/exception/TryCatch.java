// program to demonstrate try multiple catch block
package com.tnsif.exception;

public class TryCatch {
	
	public static void divide() {
	int a=6, b=0, c;
	try {
	c=a/b; //exception raised
	}
	catch(ArithmeticException e) {
		System.out.println("exception caught"+e.getMessage());
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("exception caught"+e.getMessage());
	}
	catch(Exception e ) {
		System.out.println("exception caught"+e.getMessage());
		
		
	}
  }
}