package inheritanceEx;

class A1{			// one class contain multiple constructors, parameterized & non-parameterized.
	
	public A1() {		// i declare constructor of A1
		
		System.out.println("Default constructor A1");
	}
	
}
class B1 extends A1{
	
		public B1() {		// i declare constructor of B1.In B1 constructor "super()" is hidden so its giving call to his parent constructor A1.bcoz we extends B1 constructor.
			
			System.out.println("Default constructor B1");	// here super() statement is hidden its giving call to Default constructor of parent class. here parent of ConEx1 is A1. 
			
		}
	
}

public class ConEx1 extends B1 {
		// super()            // super() is hidden giving call to parent class constructor because we extend parent in child class.
		public ConEx1() {	// i declare constructor of ConEx1. In ConEx1 constructor "super()" is hidden so its giving call to his parent constructor B1.bcoz we extends ConEx1 constructor.
		
		System.out.println("Default constructor ConEx1"); 	// here super() statement is hidden its giving call to Default constructor of parent class. here parent of ConEx1 is B1. 
		
		}
	
	public static void main(String[] args) {
		
		ConEx1 obj = new ConEx1(); //---> this object direct call to Default constructor ConEx1.
		
	}

}
