package inheritanceEx;

class parent{
	  	int a = 10, b =20;
	  	static int x = 10,y = 20;
	  	
	  	public void test1() {
	  		System.out.println("test 1 ");
	  	}
	  	public void test2() {
	  		System.out.println("test 2 ");
	  	}
	  	public static void test3() {
	  		System.out.println("test 3 ");
	  	}
	  	public static void test4() {
	  		System.out.println("test 4 ");
	  	}
}

public class Ex1 extends parent {	// child cls me hamesha only non-static data hi inherite hoga parent cls ka.
	/*  int a = 10, b =20;		// Non-Static variable of parent
	  
	  	public void test1() {		//NonStatic method of parent
	  		System.out.println("test 1 ");
	  	}
	  	
	  	public void test2() {		//NonStatic method of parent
	  		System.out.println("test 2 ");
	  	}
	  	
copy of NonStatic data(variable & methods)of parent class is copied in child class. Static data(variable & methods)of parent class is not copied in child class.  		
	 
	 */
// when u extends parent in child class(Ex1),only NonStatic data(variable & methods) send their copy here bcoz NonStatic data having multiple copy. Static data(variable & methods) having single copy.so,child not copy parent class static data.
	public static void main(String[] args) {
		Ex1 obj = new Ex1();	//already my NonStatic data of parent copied in child class so, with the help of child class object i can access NonStatic data(variable & methods)of parent class in child class.  
		obj.test1();	// now i accessing parent cls non-static global variable with the help of child cls object.
		obj.test2();
		System.out.println(obj.a);
		System.out.println(obj.b);

	}

}
