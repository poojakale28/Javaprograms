package exceptionEx;		//whatever happen but in "return statement" also finally block execute.

public class ReturnExInTry_catch {

	public static void main(String[] args) {
		System.out.println("** program start **");
		
		ReturnExInTry_catch obj = new ReturnExInTry_catch();
		
		int sum = obj.addition(10,20);
		System.out.println("sum :"+sum);
		
		System.out.println("** program end **");
	}
	public int addition(int a,int b) {
		int sum = 0;
		try {
				System.out.println(" inside try block");
				System.out.println("a : "+a);
				System.out.println("b :"+b);
				sum = a+b;
				if(sum != 0) {
					return sum;			// u can return sum from here but before that finally block will execute.
					}
				System.out.println("try block end");
			}
		catch(Exception e) {
			
			System.out.println(" inside catch block");
		}
		finally {
			
			System.out.println("inside finally block");	 //only finally block execute after try block,below finally block remaining statement not execute.
		}
		
		System.out.println("after try-catch-finally block");
		return sum;	
	}


}