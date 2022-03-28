package encapsulationEx;

class Ex11	//this class may be ur another class from same package,different package,u can access that class methods & global variables with the help of obj.
{
	private int a=10,b=20;	//non-static global variables
	
		public void test() {
		int sum = a+b;
		System.out.println("sum = "+sum);
		}
}

public class Ex1 {
	public static void main(String[] args) {
		Ex11 obj = new Ex11();
		
	//	System.out.println(obj.a);	//after making variable private of class ex11,it is not access in ex1 class.
	//	System.out.println(obj.b);
		
		obj.test();		//u can access those private variables by calling public method of ex11 class;
	}

}


/* Encapsulation --> accessing private global variable of other class in current class,
 * just by making method as public of other class ,and accessing that method in current
 * class by creating object of current class, this is know as "Encapsulation".
 */
 
