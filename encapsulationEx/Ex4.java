package encapsulationEx;


class Ex14{
	
	private int a=10,b=20;		//(global variable)
	
	public void setA(int x) {	
		
		this.a = x;	//which value pass are capture here in 'int x' and that value giving to global variable
	}		
	public void setB(int y) {	//(local variable)
		
		this.b = y;		//yaha hm bolenge,local ki value global me dalo. means user jo input de rha h wo 'y' se global variable 'a' ko pass kro. us local value se set kro.
	}
	public int getA() {		
		
		return a;
	}
	public int getB() {		
		
		return b;
	}
	
}


public class Ex4 {
	public static void main(String[] args) {
		Ex14 obj = new Ex14();
		System.out.println("*** before update ****");
		System.out.println(obj.getA());
		System.out.println(obj.getB());
		obj.setA(55);		// passing values in set().user can pass as per his requirment.
		obj.setB(77);		//u can chage this values whenever u want.
		System.out.println("*** after update ***");
		System.out.println(obj.getA());
		System.out.println(obj.getB());

	}

}
