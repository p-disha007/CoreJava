package com.tns.staticprograms;

public class Myclass {
	private int section; //instance
	static int srNo; //static variable
	
	static {
		System.out.println("----static Block----");
		srNo=1000;
	}

	public Myclass() {
		super();
		
		System.out.println("----Deafult constructor----");
	}
	
	static void display() {
		System.out.println("----static method----");
		System.out.println("the serial no is"+srNo);
	}

	@Override
	public String toString() {
		return "Myclass [section=" + section + "]";
	}
	
	

}
