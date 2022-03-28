package pragramEx;	//121 343 212 ---> like this(jiska reverse kro to same hi no. ata h this is "palindrome" use the logic of reverse no. in this)

public class PalindromeNoEx {

	public static void main(String[] args) {

		int num = 122;
		int temp = num;
		int rem = 0;
		int rev = 0;

		while(temp > 0) {

			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp/10;
		}

		if(num == rev) {

			System.out.println(num+" is a palidrome number");
		}
		else {

			System.out.println(num+" is not palindrome number");
		}

	}

}
