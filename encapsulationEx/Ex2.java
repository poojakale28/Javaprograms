package encapsulationEx;

class Ex12
{
	private int a = 10, b = 20;	//private variable can access only within class,access outside of class not allowed
	
	public int getA() {		//get()--> use to get value from global variable which is declare private.
		
		return a;
	}
	public int getB() {		//get() is always public.getB() taking value from private variable 'b' as "20" & return it."20" is integer so,return type of getB() is int.
		
		return b;
	}
//get() used to access private values of global variables.	
}

public class Ex2 {
	
	public static void main(String[] args) {
		Ex12 obj = new Ex12();
		
		int a = obj.getA();
		System.out.println(a);
		
		int b = obj.getB();
		System.out.println(b);
		
		int sum = a+b;
	//	int sum = obj.getA() + obj.getB();
	//	System.out.println("sum ="+sum);
		System.out.println("sum = "+(obj.getA()+obj.getB()));
		
	}
	
}
