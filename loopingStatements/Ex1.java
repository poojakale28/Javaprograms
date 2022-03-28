package loopingStatements;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("***program starts***");
		int a = Ex1.test((byte)1);
		System.out.println(a);
		System.out.println("***program ends***");
	}
	public static byte test(byte b) {
		
		for(byte b1 = b; b1 <= 10; b1 ++) {
			
			System.out.println(b1);
		}
		return b;
	}

}
