package StaticAndNonStatic;
// Calling Non-Static Methods And Non-Static GlobalVariables 
public class Ex1 {

	int a=10, b=50;			//non-static global variables

	// non-static global methods:
	
	public void test1() {

		// direct calling global variables & methods

		System.out.println("a = "+a);
		System.out.println("b = "+b);
		test2();

		// by creating object of class & then calling global variables & methods
		// but don't use this because it's again create memory after creating object.
		Ex1 obj = new  Ex1();		
		System.out.println("obj.a ="+obj.a);
		System.out.println("obj.b ="+obj.b);
		obj.test2();
		
		// by using "this" keyword. this keyword use to call non-static global variable & methods in non-static methods
		
		System.out.println("this.a ="+this.a);
		System.out.println("this.b ="+this.b);
		this.test2();
	}
	
	public void test2() {
		System.out.println("test 2");
	}

	public static void main(String[] args) {
		
		System.out.println("*** program starts ***");
		
		Ex1 obj1 = new  Ex1();		
		obj1.test1();
		
		System.out.println("*** program ends ***");
		
		
	}

}
