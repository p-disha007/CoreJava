package com.tnif.encapsulationprog;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation ob= new Encapsulation();// object creation
		//ob.name="suma";// calling the variables
		//ob.age=33;
		//ob.serialNum=22;
		ob.setAge(22);
		ob.setName("Ramya");
		ob.setSerialNum(55);
		System.out.println(ob);

	}

}
