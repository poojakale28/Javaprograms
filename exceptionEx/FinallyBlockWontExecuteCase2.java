package exceptionEx;	// 2]case : if exception finally block me aya , to wo line se remaining lines in finally block not execute.

//jis line pe exception aya uske age ka execution nh hoga program stop ho jayega waha se always. u can write coding in try.catch,also in fianlly block.

 public class FinallyBlockWontExecuteCase2 {

	public static void main(String[] args) {
		
		System.out.println("** program start **");	
		
		try {
		System.out.println( "** inside try block **");	
		int a = 10,  b = 2;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		int div = a/b;
		System.out.println("division :"+div);
		System.out.println("** try block end **");
		} 
		catch(Exception e) {
			System.out.println("** inside Exception block ** ");
			System.out.println("** inside Exception block 2 ** ");
		}
		finally {					
			System.out.println("** inside finally block **");
			int[] ar = {10,11,12};
			System.out.println(ar[5]);			//exception occur here --> ArrayIndexOutOfBoundsException
			System.out.println("** finally block ends **");
		}
		
		System.out.println("** program end **");	
	}

}
