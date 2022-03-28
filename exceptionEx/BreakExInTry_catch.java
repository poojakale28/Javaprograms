package exceptionEx;		//whatever happen but in "break statement" also finally block execute.

public class BreakExInTry_catch {

	public static void main(String[] args) {
		System.out.println("** program start **");
		
		BreakExInTry_catch obj = new BreakExInTry_catch();
		obj.test(); 
		
		System.out.println("** program end **");
	}
	public void test(){
		
		try {
				System.out.println(" inside try block");
				for(int i = 1; i <= 10 ; i ++) {
				
					System.out.println(i);	
					if(i == 5) {
						break;				// "break statement" use to break some values printing inside for loop.
					}
				}
				System.out.println("try block end");
			}
		catch(Exception e) {
		
			System.out.println(" inside catch block");
		}
		finally {
			
			System.out.println("inside finally block");	  
		}
		
		System.out.println("after try-catch-finally block");
			
	}


}