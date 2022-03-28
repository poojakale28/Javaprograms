package exceptionEx;		//multiple exception handling program,these all are runtime(unchecked) exception because it occur when we run our program.

public class Ex3 {

	public static void main(String[] args) {
		Ex3 obj = new Ex3();
		System.out.println("** program starts **");
		obj.test();
		System.out.println("** program end **");
	}

	public void test() {		// it occurring multiple exception,so we write multiple try block
		
		try {				//Instead of writing 3 different try block, i write all condition i one try block, but handle them using different catch block.
		System.out.println("** inside try block **");
	
		int a = 10, b = 0;
		int div = a/b;
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		System.out.println("div ="+div); 
		
		String s = "Mumbai";
		System.out.println("charAt : "+s.charAt(2)); 
		
		int[] ar = {11,12,13,14,15};
		System.out.println("ar[i] :"+ar[2]);
		
		System.out.println("** try block ends **");

		}
		/*
		 catch(Exception e) { 			//u can not write this "catch block" before all child of exceptions,this is parent of all child of exception, so u can write it last after all child's of exceptions not first.
		 e.printStackTrace(); 			//sequence say,u can write all child exceptions blocks first, then write parent catch block, otherwise give error
		 }		
		 */
		catch(ArithmeticException e) {		//'e'--> reference name can take same in all exception
			e.printStackTrace();
		}
		catch(StringIndexOutOfBoundsException e) {		//u can write something in catch block. catch block not only printing msg.
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		/*
		 catch(Exception e) { 		//instead of writing 3 different exception,if u simply write this (Exception catch block) without adding any particular exception name, it will handle all the exception coming in program
		 e.printStackTrace(); 		//sequence say,u can write all child exceptions blocks first,then write parent catch block, otherwise give error
		 }		
		 */
	}
	
}
 