package constantEx;		// when u make variable as final u cannot update the value. assign value is fix for variable.

public class Ex1 {
	
	 final int a = 10;
	 final static int b = 200;
	
	 public static void main(String[] args) {
		Ex1 obj = new Ex1();
		System.out.println("obj.a = "+obj.a);
		
	//	obj.a = 50;		// u cannot change the value of 'a' because we declare it as "final"
		System.out.println("obj.a after update = "+obj.a);
		
		System.out.println("Ex1.b = "+Ex1.b);		// calling static variable
	//	Ex1.b = 500;	// u cannot change the value of 'b' because we declare it as "final"
		System.out.println("Ex1.b after update = "+Ex1.b);	
	}

}
