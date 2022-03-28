package constructorEx;

public class Ex3 {		//Constructor overloading (same as method overloading). For Constructor overloading same rule as method overloading. 
	
	//Constructor overloading		// example of parameterized constructor overloading.
	
	int a;
	float b;
	public Ex3() {
		System.out.println("Default con");
	}
	public Ex3(int a) {
		System.out.println("parameterised con 1");
	}
	public Ex3(int a, int b) {
		System.out.println("parameterised con 2");
	}
	public Ex3(float a, float b) {
		System.out.println("parameterised con 3");
	}
	public Ex3(int a, float b) {
		System.out.println("parameterised con 4");
	}
	public Ex3(float a, int b) {
		this.b = a;			// u can initialized global variable by parameters. (this.b) is global variable having float datatype and a is local variable having float datatype in parameter so, we write (this.b = a) (both are float),means we adding value of local variable (float a) in global variable (float this.b) 
		this.a = b;
		System.out.println("parameterised con 5");
	}
	
	
	public static void main(String[] args) {
		Ex3 obj = new Ex3();
		Ex3 obj1 = new Ex3(10);				//this will call (int) type constructor,because in bracket only single int value pass. it working as per paramters.
		Ex3 obj2 = new Ex3(20, 30);			//this will call (int,int) type constructor
		Ex3 obj3 = new Ex3(22.77f, 7.2f);	//this will call  (float,float) type constructor
		Ex3 obj4 = new Ex3(22, 0.33f);		//this will call (int,float) type constructor
		Ex3 obj5 = new Ex3(10.56f, 12);		//this will call (float,int) type constructor

	}

}
