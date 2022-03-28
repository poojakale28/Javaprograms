package narrowingWidening;

public class Ex2 {	//follow number line of narrowing widening diagram here

	public static void main(String[] args) {
		
		long l = 128;
		byte b = (byte) l;		//byte range = 127 to -128,after finish range it rotate from right to left
		System.out.println("byte b = "+b);
	
		long l1 = 130;
		byte b1 = (byte)l1;
		System.out.println("byte b1 = "+b1);
		
		long l2 = -132;
		byte b2 = (byte) l2;
		System.out.println("byte b2 = "+b2);
	
		long l3 = 255;
		byte b3 =(byte)l3;
		System.out.println("byte b3 = "+b3);
		
		short s = 32767;
		int i = s;
		System.out.println(i);
	}

}
