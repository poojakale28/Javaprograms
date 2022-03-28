package exceptionEx;			//single exception handling program

public class Ex2 {

	  public static void main(String[] args) {
		Ex2 obj = new Ex2();
		System.out.println("** program starts **");
		obj.division(10, 0);
		System.out.println("** program end **");
	}
	
	  public int division(int a, int b) {
		
		int div = 0;		//local variable chya inside value bydefault print hot nh mnun (int div = 0) kela.
		try {
			System.out.println("** inside try block **");
			System.out.println("a = "+a);
			System.out.println("b = "+b);
			div = a/b;									//exception occur in this line, below lines all are skip in try block and jump to catch block to handle coming exception
			System.out.println("division : "+div);
			System.out.println("** try block end **");	
		}
		catch(ArithmeticException e) {
			
			System.out.println("** inside catch block **");
			
			e.printStackTrace();					//exception msg print kela.
		//	System.out.println(e.getMessage());		//msg print in black color
		//	System.err.println(e.getMessage());		//msg print in red color, but error msg print anywhere.
			
			System.out.println("** catch block end **");		//exception catch block ne handle kelywr catch block chya khalchya line pn print honar.
		}
			System.out.println(div);		//local variable chya inside value bydefault print hot nh mnun (int div = 0) kela. div intilize karav lgla because apn return div krtoy. without exception asel tr value print hoil division mde, but exception ala tr locally declare div=0 print hoil.
			return div;						//(div) print pn krych ahe, ani return pn, so (int div= 0) intilize kely locally.
	}
	
}
