package encapsulationEx;

/*if we hv thousand of variable, no time to create getter setter method for every variable,
just right click on screen-->source-->generate getter & setter -->select that */

class Ex16
{
	private int a,b,c,d;	

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	}
public class AutomaticGetSetMethod {
	
	public static void main(String[] args) {
		Ex16 obj = new Ex16();
		
		System.out.println("before update obj.getA() = "+obj.getA());		// before update
		obj.setA(55);
		System.out.println("after update obj.getA() = "+obj.getA());		// after update,update done by setA().
		
		System.out.println("before update obj.getB() = "+obj.getB());	   //before update
		obj.setB(714);		
		System.out.println("after update obj.getB() = "+obj.getB());	   // after update
		
		System.out.println("before update obj.getC() = "+obj.getC());
		obj.setC(800);
		System.out.println("after update obj.getC() = "+obj.getC());
		
		System.out.println("before update obj.getD() = "+obj.getD());
		obj.setD(652);
		System.out.println("after update obj.getD() = "+obj.getD());



	}

}
