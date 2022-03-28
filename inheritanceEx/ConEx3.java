package inheritanceEx;

class A3 {
			int y = 200;
			static int z = 300;
			public A3() {	
				
				System.out.println("this is default constructor of A3");	// super() hidden in every type of constructor.
			}
			
			public A3( int a) {
				this();
				System.out.println("this is parameterized constructor of A3");
			}
}
	
class  B3 extends A3 {
			//int x = 500;		// global variable of class B3, this global variable called by ConEx3 class (using super.)s       
// if i hide this global variable of B3 class, then it is print global variable of A3 class. because grand parent data transfer to parent and (grant parent+parent)data transfer to child. 		
			public B3() 
			{
				this(3,4,9);
				System.out.println("this is default constructor of B3");
			}
			
			public B3( int a) {
				super(500);
				System.out.println("this is parameterized constructor of B3 of (int)");
				System.out.println("static variable ="+A3.z);		// for calling other class static data, with the help of className
			}
			
			public B3(int a,int b, int c) {
				this(10);
				System.out.println("this is parameterized constructor of B3 of (int,int,int)");
			}
}	
	
public class ConEx3 extends B3{
	
			public ConEx3() {	
				super();
				System.out.println("this is default constructor of ConEx3");
			//	System.out.println("super.x = "+super.x);	// parent class global variable access krysati (super.) aste
				System.out.println("super.y = "+super.z);
			}
			
			public ConEx3(int a) {
				this();
				System.out.println("this is parameterized constructor of ConEx3");
			//	System.out.println("super.x = "+super.x);
				System.out.println("super.y = "+super.y);	// if parent global variable not given it will print global variable of grand parent class.
			}
			
			public void test() {		// this is method  and remaining all are constructors
				
				System.out.println("super.y = "+super.y);
			}
			
			
	public static void main(String[] args) {
				
				ConEx3 obj = new ConEx3(10);		// parameterized constructor call of class ConEx3.
				obj.test();							// after finish all constructor calling, it will call last obj.test()
				

	}

}




