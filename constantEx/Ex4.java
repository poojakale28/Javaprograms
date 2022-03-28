package constantEx;		// when u make method as "final" u cannot override that method in child class.

class Parent11 {
	
	final int MARKS = 300;
	
	final public void m1() {
		System.out.println( "m1 method of parent class");
	}
	
}

public class Ex4 extends Parent11 {
	
	 final int a = 100;
	 
	public static void main(String[] args) {
		Ex4 obj = new Ex4();
		
		System.out.println(obj.a);		// u cn only access
	//	obj.a = 20;		// ERROR bcoz it is final.
		
		System.out.println(obj.MARKS);		// u can access the value of Marks here, but cannot update bcoz it is final.
		
		obj.m1();		// just access method cannot allow to override bcoz it is "final method"									
	}
	
/*	final public void m1() {					// cannot override final method .
		System.out.println( "m1 method of parent class");
	} */

	
	
}
