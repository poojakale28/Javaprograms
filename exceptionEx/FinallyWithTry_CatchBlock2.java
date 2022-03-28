package exceptionEx;

import java.util.Scanner;

public class FinallyWithTry_CatchBlock2 {

	public static void main(String[] args) {
		System.out.println("** program start **");
			
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("inside try block");
			System.out.println("Enter the value of a :");
			int a = sc.nextInt();
			System.out.println("Enter the value of b :");
			int b = sc.nextInt();
			int div = a/b;				
			System.out.println("div :"+div);		// if exception occur in try block then,try block unable to close the object of scanner class.
		
		}	catch(ArithmeticException e) {			// if we have multiple exception we are unble to write sc.close in any catch block.
			
			System.out.println("inside catch block 1");
			e.printStackTrace();
			
		}	catch(Exception e) {			
			
			System.out.println(" inside catch block 2");
		}
		finally {
			
			sc.close();
			System.out.println("inside finally block");			//so,finally block is used to close the object of scanner class, or for closing sql connection.
		}
		
		System.out.println("** program end **");		

//"program end" print nh hua because catch block exception handle krne ke liye tha nh,to program abnormally stop hoga bs try block me jaha exception aya waha wha se wo progrm try block se catch me jump hoga but catch block to h nahi so,exception throw hoga aur finally block execute hoga, exception aye na aye but finally block will always execute. 
	}

}
