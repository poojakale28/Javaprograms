package interfaceEx;	// here 2 interface, one abstract class inherit in one class . & that one class again inherit in another cls.


interface interF11{		// interface
	
	public int addition(int a, int b);
}

abstract class ArithmaticOp{		//abstract class 
	
		abstract public int subtraction(int a, int b);	// abstract method
	
		public int multiplication (int a, int b) {		//concrete method
			
			return a*b;
		}
		
}

interface interF22{		// interface	// this is multiple inheritance ,multiple inheritance only support in interface.
	
	public int division(int a, int b);
}

class MiddleEx extends ArithmaticOp implements interF11,interF22 {	// here we all abstract methods are override(implement)

	
	public int division(int a, int b) {
		return a/b;
	}

	
	public int addition(int a, int b) {
		return a+b;
	}

	public int subtraction(int a, int b) {
		return a-b;
	}
	
	
}

public class InterFEx1 extends MiddleEx {

	public static void main(String[] args) {
		
	}

}
