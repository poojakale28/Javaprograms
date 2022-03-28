package StaticAndNonStatic;
//Calling Non-Static Methods And Non-Static Global Variables By Multiple Object

public class Ex2 {
	
	public int a=10;		// non-static global variable

	public void test1() {System.out.println("test1");}	// non-static method
	public void test2() {System.out.println("test2");}	// non-static method

	public static void main(String[] args) {
		
		Ex2 obj1 = new Ex2();	
		Ex2 obj2 = new Ex2();	
		Ex2 obj3 = new Ex2();	
	
	System.out.println("***before update***");
	
	System.out.println("obj1.a ="+obj1.a);
	System.out.println("obj2.a ="+obj2.a);
	System.out.println("obj3.a ="+obj3.a);
	
	obj1.a = 100;
	obj2.a = 200;
	obj3.a = 300;
	
	System.out.println("***after update***");
	
	System.out.println("obj1.a ="+obj1.a);
	System.out.println("obj2.a ="+obj2.a);
	System.out.println("obj3.a ="+obj3.a);
	
	Ex2 obj4 = new Ex2();	

	System.out.println("obj4.a ="+obj4.a);
	
	System.out.println("**obj1 calling test1() and test2()**");
	obj1.test1();
	obj1.test2();
	System.out.println("**obj2 calling test1() and test2()**");
	obj2.test1();
	obj2.test2();
	System.out.println("**obj3 calling test1() and test2()**");
	obj3.test1();
	obj3.test2();
	System.out.println("**obj4 calling test1() and test2()**");
	obj4.test1();
	obj4.test2();

}

}
