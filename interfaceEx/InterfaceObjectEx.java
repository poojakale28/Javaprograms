package interfaceEx;


interface interf1{
	
	public int addition(int a,int b);
	
	public int subtraction(int a,int b);

/*	interf1(){					// constructor not allowed in interface . 
		
		
	}	*/
	
}

public class InterfaceObjectEx{
	
	public static void main(String[] args) {
		
		interf1 obj = new interf1() {			// u can make obj of interface like abstract class.and implement abstract methods
			
			public int addition(int a, int b) {
				return a+b;
			}

			public int subtraction(int a, int b) {
				return a-b;
			}		
			
		};	// here i implement all abstract methods.	
		
		System.out.println(obj.addition(2, 2));		// and obj through call kra.
		System.out.println(obj.subtraction(10, 3));
		
		
	}
	
} 



