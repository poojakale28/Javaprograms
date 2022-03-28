package polymorphismEx;

//child cls me hamesha only non-static data hi inherite hoga parent cls ka. but method overriding me non-static method hi override hogi , non-static global variable nahi. because MethodOveriding is deals with Methods only.

class parent1{
	
	int a = 10, b= 30;
	
	public void test1() {
		
		System.out.println("test 1 of parent class");
	}
	public void test2() {
		int a=10,b=10;
		System.out.println("test 2 of parent class");
	}
}

public class MethodOverriding extends parent1 {
// as i extend parent in child class copy of non-static data coming here automatic, i can access non-static data of parent cls by making object of child class
	public static void main(String[] args) {
		MethodOverriding obj = new MethodOverriding();			//child obj
		
			obj.test2();	// when i do (obj.) it give me choice to call either child class test2() method or parent class test2().
			obj.test2(100, 200);	// test2() is override here,obj.test2() kiya to parent cls ki method call hogi.aur obj.test2(int a,int b) kiya to parent cls ki method cl hogi.
		
			obj.test1();
			obj.test1(22.7f);
	}
	
	public void test2 (int a, int b) {		// i override test2() of parent cls in child cls just by passing parameters & the method body of child class test2().
		System.out.println( "test 2 of child class");
	}
	public void test1( float a) {
		
		System.out.println("test 1 of child class");
	}
	
}
