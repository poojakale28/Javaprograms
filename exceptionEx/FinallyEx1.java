package exceptionEx;

public class FinallyEx1 {

	public static void main(String[] args) {
		System.out.println("** program start **");
		try {
			System.out.println("inside try block");
			int a = 10, b = 2;
			int div = a/b;				 
			System.out.println(div);
		
		}finally {
			
			System.out.println("inside finally block");
		}
		System.out.println("** program end **");
	}

}
