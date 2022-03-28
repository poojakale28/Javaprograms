package LocalAndGlobal;

public class Ex2 {

	int a = 10,	b = 60;		// global variable  
	
	static Ex2 obj = new Ex2();	
	
//global object,Instead of creating obj in main method & in test2(),I declare obj globally.
//& make globally declare obj as static.so,using that obj u can easily 
//call non-static methods in static methods.
	
	public static void main(String[] args) {
		
		System.out.println("***program starts***");
	//	Ex2 obj = new Ex2();	//Instead of creating obj in main method & in test2(),I declare obj globally.
		
//as per standard with the help of className call global variable and static methods.
		System.out.println(Ex2.obj.a);
		System.out.println(Ex2.obj.b);
//as per standard with the help of className call global variable and static methods.
		Ex2.obj.test1();
		Ex2.test2();		
		Ex1.test2(); //direct call this method of ex1 because it is static
		Ex1 obj1 = new Ex1();	//for calling non-static method of ex1,we create object of ex1
		obj1.test1();
		System.out.println("***program ends***");
	}
	public void test1() {
		
		int a = 10,b = 20;	//local variable,we cannot access local variable outside the block(methods)
		
		System.out.println("TEST 1 STARTS");
		
		System.out.println("local a ="+a);
		System.out.println("local b ="+b);
		System.out.println("global a ="+this.a);
		System.out.println("global b ="+this.b);
		
		System.out.println("TEST 1 ENDS");
	}
	public static void test2() {
		
		System.out.println("TEST 2");

		Ex2 obj = new Ex2();
		System.out.println(Ex2.obj.a);
		System.out.println(Ex2.obj.b);
		Ex2.obj.test1();//as per standard with the help of className call global variable and static methods.

	}

}
