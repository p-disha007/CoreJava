package exceptionhandling;

public class UserdefinedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			UserDefined.validate();
		} catch (Age e) {
			System.out.println("Age exception caught"+e.getMessage());
		}

	}

}
