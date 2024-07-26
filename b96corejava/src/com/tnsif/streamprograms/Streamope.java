package com.tnsif.streamprograms;

import java.util.Arrays;
import java.util.stream.Stream;

public class Streamope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] values= new Integer[] {1,2,3,4,5}; //get the input from arrays
		Stream<Integer> stream= Arrays.stream(values); //create a stream using stream values
		// map function
		
		System.out.println("Square of a no"+Arrays.toString(values));
		stream.map(num->num*num).forEach(System.out::println);
		
		System.out.println("even no");
		Integer[] value= new Integer[] {1,2,3,4,5}; //get the input from arrays
		Stream<Integer> streams= Arrays.stream(value);
		
		streams.filter(ele->ele%2==0).forEach(System.out::println);
		
		
		System.out.println("limit operation");
		Integer[] valu= new Integer[] {1,2,3,4,5}; //get the input from arrays
		Stream<Integer> streamsobj= Arrays.stream(valu);
		
		System.out.println("skip first 2 elemnts");
		Arrays.stream(valu).skip(2).forEach(System.out::println);
		
		
		
		

	}

}
