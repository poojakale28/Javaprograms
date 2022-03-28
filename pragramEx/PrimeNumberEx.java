package pragramEx;	//Prime Number --> 1 3 5 7 9 11 13 17 ( jyala bhag jato 1 ni or itself ni)

public class PrimeNumberEx {

	public static void main(String[] args) {

		int num = 17;
		int temp = 0;
		
		for(int i = 2 ; i <= num-1 ; i++) {
			
			if(num % i == 0) {
				
				temp = temp + 1;
			}
			
		}
		if(temp > 0) {
		
			System.out.println(num+" is not prime");
		}
		else {
			
			System.out.println(num+" is prime");
		}
		
	}

}
