package exceptionEx;

public class Ex1 {

	  public static void main(String[] args) {
		Ex1 obj = new Ex1();
		
		obj.division(10, 2);

	}
	
	public int division(int a, int b) {
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		int div = a/b;
		System.out.println("div : "+div);
		return div;
	
	}
	
}
