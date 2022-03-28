package abstractionEx;		// this is not inheritance example.

abstract class parent1 {
	
	abstract public void m1();
	abstract public void m2();
	abstract public void m3();
	
	public void m4() {
		
		System.out.println(" concrete method");
	}
	
	parent1(){
		
	}			//constructor allwed in abstarct class.
	
}

public class AbsObjectEx {		//if i not extend parent cls in child cls but i can make obj of parent cls in child cls,"AbsObjectEx"this is child cls

	public static void main(String[] args) {
		parent1 obj = new parent1() {		//it is mandatory to create body of constructor while creating object.
			 public void m1() { System.out.println(" abstract method 1"); }	// implement abstract methods inside this constructor body
			 public void m2() { System.out.println(" abstract method 2"); }
			 public void m3() { System.out.println(" abstract method 3"); }
		
		};
		obj.m4();
		obj.m1();
		obj.m2();
		obj.m3();
		
		
	}

}

/* Interview question :
 * Can u make object of abstract cls ???
 * ans : yes, it is mandatory to create body of constructor while creating object. and implement abstract method inside the constructor and call them after making object.
 */