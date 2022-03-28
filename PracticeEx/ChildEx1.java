package PracticeEx;

public class ChildEx1 extends parent{

	public void test() {
		
		System.out.println("test method of child class");
		
	}
	
	public static void main(String[] args) {
		ChildEx1 obj = new ChildEx1();
		obj.test();					// child class called its own (overideed) method,because test() have no parameter.so,child called its own method
		
		parent obj1 = new parent();
		obj1.test();				//parent class called its own method
	}

}

class parent {
	
	public void test() {
		
		System.out.println("test method of parent class");
	}
	
}