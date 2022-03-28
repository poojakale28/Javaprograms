package constructorEx;

public class ThisConEx1 {

	public ThisConEx1() {
		this(10);		// as we pass this(10), so 10 is int so, 2nd int type of constructor is call.
		System.out.println("Default con");	
	//	this();  		(error) // we can't call multiple constructor from one constructor.only single constructor call using this(). and this() is first statement of constructor, we can't write multiple this().we can't write this() after SOP it give you error. 
	}
	public ThisConEx1(int a) {
		System.out.println("parameterised con 1");
	}
	public ThisConEx1(int a, int b) {
		System.out.println("parameterised con 2");
	}
	public ThisConEx1(float a, float b) {
		System.out.println("parameterised con 3");
	}
	public ThisConEx1(int a, float b) {
		System.out.println("parameterised con 4");
	}
	public ThisConEx1(float a, int b) {	// b is int & a is float so, as i call this(b,a)-->first passing int then 2nd passing float so, 5th constructor call.
		this(b,a);						// ctrl+click = direct constructor wr jato jo call honar tyawr
		System.out.println("parameterised con 5");
	}
	
	public static void main(String[] args) {
		System.out.println("*** program starts***");
		
		ThisConEx1 obj = new ThisConEx1();
		ThisConEx1 obj1 = new ThisConEx1( 2.2f ,89);
		
		System.out.println("*** program ends***");
	}

}
