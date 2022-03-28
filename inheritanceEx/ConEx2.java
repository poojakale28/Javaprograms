package inheritanceEx;	// super() & this() used in constructor calling as well as method calling of same class(use this()) & parent class (use super()).
// this all are constructors(parameterized and non-parameterized) . we call parameterized and non-parameterized constructors in every class.
class A2 {
	
			public A2() {	// this all are constructors(parameterized and non-parameterized)
				
				System.out.println("this is default constructor of A2");	// super() hidden in every type of constructor.
			}
			
			public A2( int a) {
				this();
				System.out.println("this is parameterized constructor of A2");
			}

}


class  B2 extends A2 {
	
			public B2() 
			{
				this(3,4,9);	// this will call same class parameterized constructor.i.e,(int a,int b,int c) constructor call now.
				System.out.println("this is default constructor of B2");
			}
			
			public B2(int a) {	//this will call same class parameterized constructor.i.e,(int a) bcoz we passing single int value.
				super(500);
				System.out.println("this is parameterized constructor of B2 of (int)");
			}
			
			public B2(int a,int b, int c) {
				this(10);	// as u pass 10, giving call to same class (int type) constructor.
				System.out.println("this is parameterized constructor of B2 of (int,int,int)");
			}	
}


public class ConEx2 extends B2{
	
		public ConEx2() {		// this is non-parameterised constructor . and below is parameterized constructor, u can create multiple constructor in one class , but change the parameter every time.
			super();		// super() --> giving call to parent class default constructor. u can write either super() or this() in one constructor at a time. 
			System.out.println("this is default constructor of ConEx2");
		}
		public ConEx2(int a) {
			this();		// this() --> giving call to same class default constructor . and super() is hidden in every constructor .
			System.out.println("this is parameterized constructor of ConEx2");
		}
		
	public static void main(String[] args) {
		
		ConEx2 obj = new ConEx2(10);	// as you pass 10, this giving call to parameterized constructor of ConEx2.
		
	}

}
