package MethodPractice;

public class Ex1 {

	/*	method syntax :
access_specifier static/non-static(optional) return_type(all 8 datatype/non-premitive datatype/void) method_name(parameter(optional)) {
		
	}*/
	
	
	public void addition() {	//this method return_type is void so, it is not write in SOP.
		int a = 10, b = 20;
		int sum = a+b;
		System.out.println("sum = "+sum);
	}
	
	public void subtraction() {	//this method return_type is void so, it is not write in SOP.
		int a = 100, b = 20;
		int sub = a-b;
		System.out.println("sub = "+sub);
	}
	
	public void multiplication() {	//this method return_type is void so, it is not write in SOP.
		int a = 10, b = 20;
		int mult = a*b;
		System.out.println("mult = "+mult);
	}
	
	public void division() {	//this method return_type is void so, it is not write in SOP.
		int a = 10, b = 2;
		int div = a/b;
		System.out.println("div = "+div);
	}
	public static void main(String[] args) {
		
		Ex1 obj = new Ex1();
		
	//	System.out.println(obj.addition());		//return_type of all methods is void, so don't write in SOP
	//	System.out.println(sum);				//variable "sum" is having access within only addition method,so u can't SOP "sum" variable in main method.
		
		obj.addition();
		obj.subtraction();
		obj.multiplication();
		obj.division();
	}
}
