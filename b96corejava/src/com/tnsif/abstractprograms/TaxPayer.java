package com.tnsif.abstractprograms;

public abstract class TaxPayer {
	protected double salary;

	public TaxPayer(double salary) {
		super();
		this.salary = salary;
	}
	public abstract double calTax();
	public void display() {
		System.out.println("the tax paid is")	;
		}

}
