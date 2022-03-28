package PracticeEx;		//this() and super() is used to call constructors. "this." and "super." is used to call non-static methods and variables.

public class Ex2 {

	public void a1() {
		this.a1(5);					//to call other method of same class use "this."
		System.out.println("a1");
	}
	public void a1(int a) {
		a1(2,3);					//if u not write "this." then compiler by default put "this." in front of method.
		System.out.println("int a");

	}
	public void a1(int a, int b) {
		System.out.println("int a, int b");

	}
	public void a1(int a, int b, int c) {
		System.out.println("int a, int b, int c");

	}
	
	
	public static void main(String[] args) {
		Ex2 obj = new Ex2();
		obj.a1();
		
	}

}
