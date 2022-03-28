package StaticAndNonStatic;

// for calling static data to static block --> always call using ClassName

public class Ex3 {
	
	public static int a = 500, b = 300;
	
	public static void test3() {
		
		System.out.println("test 3");

		System.out.println("a ="+Ex3.a);
		System.out.println("b ="+Ex3.b);
	}
	
	public static void test4() {
		
		System.out.println("test 4");
		
	//	test3();		// by calling directly because test3() and test4() both are static so,direct calling is possible
		
		Ex3.test3();	// by ClassName u can call method , always use this option.
		
	/*	Ex3 obj = new Ex3();	//calling by creating object but it is not recommend.
		obj.test3();		*/
	}
	

	public static void main(String[] args) { 
		// no need to create object because we calling static data to static block,call using ClassName
		
		System.out.println("*** program starts ***");
		Ex3.test3();
		Ex3.test4();
		System.out.println("*** program ends ***");

	}
	
}
