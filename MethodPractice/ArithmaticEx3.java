package MethodPractice;

public class ArithmaticEx3 {
	
	//if u want to store result in small datatype then type casting required.
	//if u want to store result in big datatype then type casting not required
 	
	public void additionofIF(int a,float b) {
		int sum = (int)(a+b);	//type casting	// or a+(int)b	
		System.out.println("additionofIF = "+sum);
	}
	public void additionofFI(float a,int b) {
		float sum = a+b;		//this is not type casting,float is big than int, result store in float so type cast not required.//or int sum = (int)a+b;(type casting)
		System.out.println("additionofFI = "+sum);
	}
	public void additionofDF(double a,float b) {
		float sum = (float)a+b;		//this is type casting    //or double sum = a+b;(this is not type casting)
	System.out.println("additionofDF = "+sum);
	}
	public void additionofBB(byte a,byte b) {
		byte sum = (byte)(a+b);		
	System.out.println("additionofBB = "+sum);
	}
	public void additionofSS(short a,short b) {
		short sum =(short)(a+b);	
		System.out.println("additionofSS = "+sum);
	}
	public void test1(char c) {
		System.out.println("char c = "+c);
	}
	public void test2(boolean b) {
		System.out.println("boolean b = "+b);
	}
}

//type casting required mostly in byte and short because when we send data, it is consider as int.so in LHS and RHS required type casting.