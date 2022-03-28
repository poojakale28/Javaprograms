package interfaceEx;

public interface InterfaceWithDefault {		// u can implement one or more method using default keyword.
	
	public int addition(int a, int b);
	
	public int subtraction(int a, int b);
	
	default public int multiplication(int a, int b) {		//here "default" is not access specifier,it is keyword which implement method.
		return a*b;
	}
	
	default public int division(int a, int b) {
		return a/b;
	}
}

class AI implements InterfaceWithDefault {		// interface inherite krt ah class mde

	
	public int addition(int a, int b) {
		
		return a+b;
	}

	
	public int subtraction(int a, int b) {
		
		return a-b;
	}			
	
}