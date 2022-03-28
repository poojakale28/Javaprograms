package PracticeEx;			//very very important example

public class Ex1 extends parent1 {

	public static void main(String[] args) {
		parent1 p = new Ex1();			//In LHS i take parent reference and in RHS i take child class reference using "new" keyword
		p.test();						//child class method call because "new" ke bad child class liya h.
		
	}
	
	public void test() {
		
		System.out.println("test method of child class");
	}
	
}

class parent1 {
	
	public void test() {
		
		System.out.println("test method of parent class");
	}
	
}