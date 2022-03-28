package conditionalStatements;

public class Ex1 {	// no is greater or less than 100 program :

	public static void main(String[] args) {
		
		Ex1.test1(1000);		// i call test1() using className bcoz it is static,if test1() is non-static method, then i will create obj. and throgh obj i call that method.
	}
	
	public static int test1(int a) {
		
		if(a<100) {
			
			System.out.println(a+" is less than 100");
			
		}else if(a==100) {
			
			System.out.println(a+" is equal than 100");
			
		}else {
			
			System.out.println(a+" is greater than 100");	
		}
		
		return a;
	}

}
