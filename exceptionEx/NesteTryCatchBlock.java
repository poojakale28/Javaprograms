package exceptionEx;		//u can write multiple try-catch blocks in "try block" also u can write multiple try-catch blocks in "catch block"

public class NesteTryCatchBlock {

	public static void main(String[] args) {
	try {
			System.out.println(" inside 1st try block");
			try {
				
				System.out.println(" inside 2nd try block");
				int a = 10, b = 0;
				System.out.println(a);
				System.out.println(b);
				int div = a/b;							//exception occur here
				System.out.println("sum = "+div);
			}
			catch(Exception e) {
				
				System.out.println(" inside 1st catch block");		//u can't print only msg but u can also write statements in catch block also.
			}
		}
	catch(Exception e) {
			try {
				System.out.println(" inside 3rd try block");

					try {
						System.out.println(" inside 4th try block");
	
					}
					catch(Exception e1) {
						System.out.println(" inside 2nd catch block");
					}
				
			}
			catch(Exception e2) {
				try {
					System.out.println(" inside 5th try block");

				}
				catch(Exception e3) {
					System.out.println(" inside 3rd catch block");
				}
				
			}
		}

	}

}
