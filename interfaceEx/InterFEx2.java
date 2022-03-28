package interfaceEx;	//here 2 interface inherit in one interface.

interface interFA{
	
		public int addition(int a, int b);
		public int subtraction(int a, int b);
}

interface InterFB{
	
		public int multiplication(int a, int b);
		public int division(int a, int b);
}

interface InterFC extends interFA,InterFB{		//2 interface inherit in one interface.
		
}


public class InterFEx2 {

	public static void main(String[] args) {

	}

}
