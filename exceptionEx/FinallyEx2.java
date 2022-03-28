package exceptionEx;

public class FinallyEx2 {

	public static void main(String[] args) {
		System.out.println("** program start **");
		try {
			System.out.println("inside try block");
			int a = 10, b = 0;
			int div = a/b;				//exception occur here ,so it will skip remaining line in try block and give exception but finally block execute either try block occur exception or not
			System.out.println(div);
		
		}finally {
			
			System.out.println("inside finally block");
		}
		
		System.out.println("** program end **");		

//"program end" print nh hua because catch block exception handle krne ke liye tha nh,to program abnormally stop hoga bs try block me jaha exception aya waha wha se wo progrm try block se catch me jump hoga but catch block to h nahi so,exception throw hoga aur finally block execute hoga, exception aye na aye but finally block will always execute. 
	}

}

//catch block bhetla exception handle krayla trch remaining line after finally block execute hoil, otherwise execute honar nh