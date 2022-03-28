package BasicPrograms;

public class GlobalData2 {

	byte b = 10;  						//this is give you values in output because it is declare and define
	short s = 20;
	int i = 50;
	long l = 15;
	float f = 25.23f;
	double d = 77.664;
	char c = '#';						//if u can use char, so u will give alphabet or symbols
	boolean b1 = true;

	public static void main(String[] args) {
		
		//if u want to call global variable inside main method so u meed to create object of class.
		
		GlobalData2 obj = new GlobalData2();
		
		System.out.println("byte b ="+obj.b);
		System.out.println("short s ="+obj.s);
		System.out.println("int i ="+obj.i);
		System.out.println("long l ="+obj.l);
		System.out.println("float f ="+obj.f);
		System.out.println("double d ="+obj.d);
		System.out.println("char c ="+obj.c);
		System.out.println("boolean b1 ="+obj.b1);
	}
}
