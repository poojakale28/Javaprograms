package encapsulationEx;

class Ex13{
	
	private int a=10, b=20;
	
	public void setA() {	//set() only update value of global variable,it's return nothing so set() are void always & public.
		
		this.a = 500;		//we only updating private global variable value,using set().
	}
	public void setB() {
		
		this.b = 700;
	}
	public int getA() {		
		
		return a;
	}
	public int getB() {		
		
		return b;
	}
	
}

public class Ex3 {
	public static void main(String[] args) {
		Ex13 obj = new Ex13();
		System.out.println("*** before update ****");
		System.out.println(obj.getA());
		System.out.println(obj.getB());
		obj.setA();	//updating values of A & B
		obj.setB();
		System.out.println("*** after update ***");
		System.out.println(obj.getA());
		System.out.println(obj.getB());
	}

}
