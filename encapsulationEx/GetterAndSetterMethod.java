package encapsulationEx;

class Ex15{
	
	private int a=10, b=20;		//(global variable)
	
	public void setA(int a) {	// (local variable) //jo global variable ka nam h,wahi local variable ko do set() me.	
		
		this.a = a;		// LHS this.a is "global variable" & RHS 'a' is "local variable"
	}		
	public void setB(int b) {	// as per standard,local variable name & global variable name must be same always
		
		this.b = b;		//user pass value '77' in setB(),we capture it in "int B" .local and global variable must be same. we update global variable values(this.a)= passing value by user RHS.
	}	// yaha hm local variable ki value global me dal rhe h. (this.a)global value ko (a) local value se set kr rhe h.
	
	public int getA() {		
		
		return a;
	}
	public int getB() {		
		
		return b;
	}

}

public class GetterAndSetterMethod {
		public static void main(String[] args) {
		Ex15 obj = new Ex15();
		
		System.out.println("*** before update ****");
		System.out.println(obj.getA());
		System.out.println(obj.getB());
		
		obj.setA(55);		// passing values in set().user can pass as per his requirment.
		obj.setB(77);		//u can change this values whenever u want.
		
		System.out.println("*** after update ***");
		System.out.println(obj.getA());
		System.out.println(obj.getB());
	}

}
