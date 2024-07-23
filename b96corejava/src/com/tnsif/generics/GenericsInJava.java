package com.tnsif.generics;

import java.util.ArrayList;

public class GenericsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("JAVA");
		list.add(123);
		for(Object object:list)
		{
			//Below statement throws ClassCastException at run time 
			String str=(String) object; //Type casting
			System.out.println(str);
		}

	}

}
