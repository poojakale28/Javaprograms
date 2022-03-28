package LocalAndGlobal;

public class Ex3 {
	
//	static Ex2 obj = new Ex2(); //global obj of Ex2 class.
	
	public static void main(String[] args) {
	
		Ex2 obj = new Ex2();
//u cn make obj of different class in main method & access the all methods of that class.(static & non-static methods both)
		//obj.test2();
		//obj.test1();
//instead of creating obj of ex2 in main method,i make obj of ex2 in printMethod().and here make obj of ex3 for calling printMethod().
		
		Ex3 obj1 = new Ex3();
		obj1.printMethod();
		obj1.printMethod2();


	}

	public static void printMethod() {
		Ex2 obj = new Ex2();
		obj.test1(); 		//non-static method of ex2,with the help of object.
		Ex2.test2();		// static method of ex2,with help of className.
		
	}
	public static void printMethod2() {
		Ex2 obj = new Ex2();
		obj.test1();
	}
	
//Instead of creating Ex2 obj in printMethod() & printMethod2() we can globally declare ex2 obj.
//after declare obj of Ex2 as globally,if u make ur method static so, make ur globally declare obj as static.
		
}
