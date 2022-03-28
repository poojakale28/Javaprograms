package exceptionEx;	//printStackTrace();-->is the method of Throwable. "Throwable" is the parent of Exception. Throwable have Error & exceptions,so "printStackTrace()" is used for printing msg in ERROR &  in Exception also 

public class SequenceOfMethods {

	public static void main(String[] args) {
		System.out.println("*** program start ***");
		
		SequenceOfMethods obj = new SequenceOfMethods();
		
		obj.CreateAccount();
		obj.UpdateAccount();
		obj.DeleteAccount();
		
		System.out.println("*** program end ***");

	}

	public void CreateAccount() {
		try {
			System.out.println("create account");
			int a = 10,b=0;	
			int div = a/b;			//if exception occur in this line,so particular method catch block will handle that.and remaining all method will excuted sucessfully,it will not affected.	
			} catch(Exception e) {
				e.printStackTrace();
			}
	}
	
	public void UpdateAccount() {
		try {
			System.out.println("Update account");
			} catch(Exception e) {
				e.printStackTrace();
			}
	}
	
	public void DeleteAccount() {
		try {
			System.out.println("Delete account");
			} catch(Exception e) {
				e.printStackTrace();
			}	
	
	}
}
