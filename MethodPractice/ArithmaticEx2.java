package MethodPractice;

public class ArithmaticEx2 {
	
	public void addition(int a, int b) {	//here (int a, int b) are local variable,its scope only within block not outside block.
//		int a = 50, b = 60;
		int sum = a+b;
		System.out.println("addition = "+sum);
	}
	public void subtraction(int a, int b) {
//		int a = 60, b = 10;
		int sub = a-b;
		System.out.println("subtraction = "+sub);
	
	}
	public void multiplication(int a, int b) {
//		int a = 5, b = 6;
		int mul = a*b;
		System.out.println("multiplication = "+mul);

	}
	public void division(int a, int b) {
//		int a = 50, b = 25;
		int div = a/b;
		System.out.println("division ="+div);
	}

}
