package abstractionEx;

abstract class A1
{
		//class body : methods & variables
		//may contain all abstract methods OR all concrete methods OR combination of both
}
abstract class A2 {
	
	abstract public void test();	//declare  //abstract method don't have method body
	
}

abstract class A3		// as you write any method abstract within class then class must make "abstract".
{
	abstract public void test1();	//declare  //abstract method don't have method body
	
	public int test2() {			// declare and define(have return type) //concrete method have method body
		// method body
		return 10;
	}
}


public class Ex1 {
	
	public static void main(String[] args) {
	
	}

}
