package loopingStatements;

public class Ex2 {

	public static void main(String[] args) {
		System.out.println("***program starts***");
		Ex2 obj = new Ex2();
		obj.m1(11);
		System.out.println("***program ends***");
	}

	public int m1(int a) {
		for(int i = 11 ; i<= 30; i++) {
			
			System.out.println(i);
		}
		return a;
		
	}
}
