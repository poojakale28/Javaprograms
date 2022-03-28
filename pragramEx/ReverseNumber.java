package pragramEx;

public class ReverseNumber {

	public static void main(String[] args) {

		int rev = 0;
		int rem = 0;
		int num = 12345;
		
		while(num>0) {
			
			rem = num % 10;			//remainder
			rev = rev * 10 + rem ;
			num = num / 10 ;		// quotient 
			
		}
		
		System.out.println("reverse of number : " +rev);
	}

}
