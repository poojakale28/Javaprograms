package interfaceEx;	//here 1 interface & 1 abstract class inherit in one class.

interface interF{		// interface	// this is multiple inheritance ,multiple inheritance only support in interface.
	
	public int division(int a, int b);
}

abstract class ArithmaticOp1{		//abstract class 
	
	abstract public int subtraction(int a, int b);	// abstract method

	public int multiplication (int a, int b) {		//concrete method
		
		return a*b;
	}
	
}


public class InterFEx extends ArithmaticOp1 implements interF {		//here my one abstract cls and one interface inherite in one class.
	
	public int subtraction(int a, int b) {
		return a-b;
	}
	
	public int division(int a, int b) {
		return 0;
	}
	
	public static void main(String[] args) {
		
	}

}
