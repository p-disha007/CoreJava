package com.tns.interfacePrograms;

public interface Amazon {
	
	void welcome(); // abstract method
	void thankyou(); // abstract method
	
default void serviceCharge() {
	int amt=100;
	System.out.println("the service charge is"+amt);
	
}
static void aboutUs() {
	System.out.println("Its a ecommerce website");
}
}
