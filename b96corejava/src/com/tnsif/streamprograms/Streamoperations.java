package com.tnsif.streamprograms;

import java.util.Arrays;
import java.util.stream.Stream;

public class Streamoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using Of method
		Stream<Integer> ob= Stream.of(10,20,30,40,50);
//		System.out.println(ob);
//		ob.forEach(System.out::println);
		
		//using stream method
		Integer[] values= new Integer[] {2,3,5,8};
		ob=Arrays.stream(values);
		ob.forEach(System.out::println);
		
	}

}
