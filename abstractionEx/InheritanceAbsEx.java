package abstractionEx;

abstract class parent{		// parent cls

	/*	public void test1() {
	
	}*/
	
	abstract public void test2();
	
}

 public class InheritanceAbsEx extends parent {
	
	 public void test2() {		//this is abstract method of parent cls just implement it means give {} and remove abstract keyword from method.
		System.out.println("test 2");
	}
	
	public static void main(String[] args) {
		InheritanceAbsEx obj = new InheritanceAbsEx();
		obj.test2();	//as u implement abstract method u can call it with help of obj.
		
	}
	
// as i implement test2() of parent class in child class, no need to make cls as abstract now. now, u cn make obj of abstract cls.	

}
