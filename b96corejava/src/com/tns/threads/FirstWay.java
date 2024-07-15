package com.tns.threads;

public class FirstWay extends Thread{
	public void run() { //running
		System.out.println("creation of thread by extending thread class");	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstWay ob=new FirstWay();// thread is born-new state
		
		ob.start(); //runnable
		ob.stop();
		ob.start();

	}

}
