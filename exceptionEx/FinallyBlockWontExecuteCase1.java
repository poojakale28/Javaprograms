package exceptionEx;	
//1]case : waise to try block me exception aye na aye but "finally block" execute hota h,but kahi pe bhi system.exit(0) aya to waha se kuch bhi print nh hoga.

public class FinallyBlockWontExecuteCase1 {

	public static void main(String[] args) {
		
		System.out.println("** program start **");	
		
		try {
		System.out.println( "** inside try block **");	
		int a = 10,  b = 2;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
//		System.exit(0);	
		int div = a/b;		//if exception occur here it will jump to catch block.
		System.out.println("division :"+div);
//		System.exit(0);	
		System.out.println("** try block end **");
		} 
		catch(Exception e) {
			System.out.println("** inside Exception block ** ");
//			System.exit(0);	
			System.out.println("** inside Exception block 2 ** ");
		}
		finally {
			System.out.println("** inside finally block **");
//			System.exit(0);
			System.out.println("*** finally block end ***");
		}
		System.out.println("** program end **");	
	}

}
