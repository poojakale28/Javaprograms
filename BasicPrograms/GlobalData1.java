
package BasicPrograms;
public class GlobalData1 {
	
	//GlobalVariable declare inside class and outside methods
	
	byte b;  						//this is give you only default values in output because it is only declare.
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;
	boolean b1;

	public static void main(String[] args) {
		
		//if u want to call global variable inside main method so u need to create object of class.
		
		GlobalData1 obj = new GlobalData1();
		
		System.out.println(obj.b);
		System.out.println(obj.s);
		System.out.println(obj.i);
		System.out.println(obj.l);
		System.out.println(obj.f);
		System.out.println(obj.d);
		System.out.println(obj.c);			//output is nothing because char not having any default value
		System.out.println(obj.b1);
	}

}
