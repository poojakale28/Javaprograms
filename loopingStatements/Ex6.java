package loopingStatements;

public class Ex6 {

	public static void main(String[] args) {
		System.out.println("***program starts***");
		Ex6 obj = new Ex6();
		//obj.m1();
		obj.m2();
		System.out.println("***program ends***");
	}
	public void m1() {
	// while loop statement	: 
		
		int i = 1;						//intilization
		
		while(i<=10) {					//condition
			
			System.out.println(i);
			
			i++;						//increment/decrement
			
		}
	}
		
	public void m2() {
	// do-while loop statement :
		
		int i = 11;					//intilization
		
		do {
			
		System.out.println(i);
		
		i++;						//increment/decrement
		
		}
		while(i <= 10);					//condition
	
	}	
	
// In do-while case, execution done atleast once. but in while-loop case,if condition true then only while loop block executed,otherwise not.
	
	
}


