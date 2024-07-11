package com.tnsif.exception;

public class NestedTry {
	public static void check() {
		String str="tns";
		int arr[]=null;
		int y=6;
		try {//outer try
			// z=y/0; //exception arrised in outer try block
			
			try {//inner try
				//System.out.println(arr[0]);
				System.out.println(str.charAt(y));
			}
			catch(StringIndexOutOfBoundsException e) { //inner catch
				System.out.println("exception caught"+e.getMessage());
				
			}
			catch(NullPointerException e) {// inner catch
				System.out.println("exception caught null pointer"+e.getMessage());
				
			}
		}
		catch(ArithmeticException e) {// outer catch
			System.out.println("exception caught"+e.getMessage());
		}
		catch(Exception e) { //outer catch
			System.out.println("superexception caught"+e.getMessage());
		}
		
	}

}
