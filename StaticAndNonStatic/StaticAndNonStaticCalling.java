package StaticAndNonStatic;

public class StaticAndNonStaticCalling {
	
	public int a = 33, b = 99;		// non-static global variable
	public static int x = 20, y = 30;	// static global variable
	
	public static void main(String[] args) {
		System.out.println("***program starts***");
		StaticAndNonStaticCalling.test1();		// static calling by ClassName
		StaticAndNonStaticCalling.test2();		// static calling by ClassName
		System.out.println("***program ends***");
	}
	
	public static void test1() {	//this block calling non-static variables in static block
		
		System.out.println("test 1  starts");
		
		StaticAndNonStaticCalling obj = new StaticAndNonStaticCalling();
		int sum = obj.a + obj.b;	// calling non-static global variable
		System.out.println("sum ="+sum);
		System.out.println(StaticAndNonStaticCalling.x);	// calling static global variable
		System.out.println(StaticAndNonStaticCalling.y);
/* In test1() & test2() we take same object name but test1() obj is different 
  & test2() object is different so error not happen. */
		System.out.println("test 1  ends");
		
	}
	
	public static void test2() {	//this block calling non-static methods in static block
		System.out.println("test 2  starts");
		
		StaticAndNonStaticCalling obj = new StaticAndNonStaticCalling();
		obj.test3();
		obj.test4();
		
		System.out.println("test 2  end");
	}

	public void test3() {
		System.out.println("test 3");
		System.out.println(a);			// direct call non-static global variable
		StaticAndNonStaticCalling obj = new StaticAndNonStaticCalling();
		System.out.println(obj.a);		// by creating obj call non-static global variable
		System.out.println(this.a);		//using "this" keyword call non-static global variable
		this.test4();                   //using "this" keyword call non-static method
	}

	public void test4() {
		System.out.println("test 4");
	}


}
