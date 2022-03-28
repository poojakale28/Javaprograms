package ScannerExamples;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	//System.in-->system se input lo,runtime pe. scanner class having parameterized constructor (system.in) hmne pas kiya constructor me.	
		
	/*	System.out.println("Enter the value of a : ");
		int a = sc.nextInt();				//nextInt() --> help to take i/p in integer
		
		System.out.println("Enter the value of b : ");
		int b = sc.nextInt();
		
		System.out.println("a :"+a);
		System.out.println("b :"+b);		*/
		
//================================================================================================================
		System.out.println("Enter the String");
		String s = sc.nextLine();		// u can write whole string here on console after doing enter u can write something .both works same.
		
		System.out.println("Enter the String");
		String s1 =sc.next();			// in this u can write only first word on console but after doing enter u cannot write something.

//====================================================================================================================		
	
	}

}
