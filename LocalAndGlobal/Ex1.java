package LocalAndGlobal;

public class Ex1 {

	int a;			// global variable , 'a' gives us default value is zero. 
	int b = 60;		// global variable
	static int  c;
	public static void main(String[] args) {
		
		System.out.println("***program starts***");
		
		Ex1 obj = new Ex1();	
//here & test2() we make same obj name but this obj having access in main,& that obj having access in test2().
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.test1();
		Ex1.test2();
		
		System.out.println("***program ends***");
		
	}

	public void test1() {
		
		int a = 10,b = 20;	//local variable,we cannot access local variable outside the block(methods)
		
		System.out.println("TEST 1 STARTS");
		
		System.out.println("local a ="+a);
		System.out.println("local b ="+b);

		System.out.println("global a ="+this.a);
		System.out.println("global b ="+this.b);
		System.out.println("global c ="+Ex1.c);		
		
		System.out.println("TEST 1 ENDS");
	}
	public static void test2() {
		
		System.out.println("TEST 2");
		Ex1 obj = new Ex1();
		obj.test1();
		
	}
}
