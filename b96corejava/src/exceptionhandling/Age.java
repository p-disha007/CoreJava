package exceptionhandling;
// user defined exception

public class Age extends Exception{
	Age(String str) {
		super(str);
		System.out.println(str);
		
	}

}
