package exceptionEx;

public class FinallyWithTry_CatchBlock {

	public static void main(String[] args) {
		System.out.println("** program start **");
		try {
			System.out.println("inside try block");
			int a = 10, b = 0;
			System.out.println("a :"+a);
			System.out.println("b :"+b);
			int div = a/b;				//exception occur here ,so it will skip remaining line in try block and give exception but finally block execute either try block occur exception or not
			System.out.println("div :"+div);
		
		}	catch(ArithmeticException e) {		//if exception occur on line 12 so it will jump to catch block to handle exception,and then execute finally block
			
			System.out.println("inside catch block 1");
			e.printStackTrace();
			
		}	catch(Exception e) {			// if first catch block not handle exception then it will move to 2nd catch block otherwise not .
			
			System.out.println(" inside catch block 2");
		}
		finally {
			
			System.out.println("inside finally block");
		}
		
		System.out.println("** program end **");		

//"program end" print nh hua because catch block exception handle krne ke liye tha nh,to program abnormally stop hoga bs try block me jaha exception aya waha wha se wo progrm try block se catch me jump hoga but catch block to h nahi so,exception throw hoga aur finally block execute hoga, exception aye na aye but finally block will always execute. 
	}

}
