package interfaceEx;


interface interf3 {
	
	 public int addition(int a,int b);	// all methods are abstract.
	
	 public int subtraction(int a,int b);
}

public class Ex3 implements interf3 {		// abstract methods copy is coming here after extending interf2.
	
	public int addition(int a,int b) {
		return a+b;
		
	}
	public int subtraction(int a,int b) {
		return a-b;
	}				
	
	public static void main(String[] args) {
		
	}
	
} 



