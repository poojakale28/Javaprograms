package interfaceEx;


interface interf2 {
	
	abstract public int addition(int a,int b);
	
	abstract public int subtraction(int a,int b);

/*	interf1(){					// constructor not allowed in interface
		
		
	}	*/
	
}

abstract public class Ex2 implements interf2{
	
/*	abstract public int addition(int a,int b);
	abstract public int subtraction(int a,int b);		*/		// abstract methods copy is coming here after extending interf2.
	
	public static void main(String[] args) {
		
	}
	
} 



