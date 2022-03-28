package narrowingWidening;

public class Ex1 {	//follow narrowing widening diagram here

	public static void main(String[] args) {
		
		double d = 55.11d;
		System.out.println("double d ="+d);
		int i = (int) d;					//explicit narrowing,big data(double) going in small(int),so we need type casting
		System.out.println("int i ="+i);
	
	
		short s = 10;
		long l = s;
		System.out.println(l);//implicit widening,thisis not need type casting,bcoz small data(short)easily goes in big data(long)so,type casting not required.
		long l1 = (long)s;	// this is explicit widening
		System.out.println(l1);
	
	
		long l2 = 50;
		byte b = (byte)l2;	//explicit narrowing
		System.out.println(b);
	}

}
