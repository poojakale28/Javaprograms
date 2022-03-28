package constructorEx;

public class Ex2 {
	
	private int a,b;	// global variables
	
	public Ex2() {		//constructor is special type of method,so constructor is used to initialized global variable.
		
		this.a = 100;		// constructor is used to initialized global variable
		this.b = 500;
		System.out.println("Default Constructor");
	}

	public static void main(String[] args) {
		System.out.println("***program starts***");
		
		Ex2 obj = new Ex2();	//if i create multiple object, multiple obj ke liye multiple memory create hogi 
		Ex2 obj1 = new Ex2();
		Ex2 obj2 = new Ex2();
		Ex2 obj3 = new Ex2();	// we not SOP the variable so,in o/p only sysout statement print.
	
		System.out.println("*** program ends ***");

	}

}
