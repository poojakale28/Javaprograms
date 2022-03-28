package returnType;	//all 8 primitive datatypes,non-primitive datatypes,void all are ur return types

public class Ex2 {

	public static void main(String[] args) {
		
		System.out.println("***program starts***");
		
		Ex2 obj = new Ex2();
		
		obj.test1();	         //it'sreturn type is void, so not in SOP.
		
		System.out.println("result of byte ="+obj.test2());
		
		short s = obj.test3((short)66);
		System.out.println("sum of test3() = "+s);
		
		int x = obj.test4(8,2);  // u can chage parameter always insted of 8,2 pass anything which sum u want in o/p.
		System.out.println("sum of test4() = "+x);
		
		long l =obj.test5(5);
		System.out.println("result of test5() = "+l);
		
		float a = obj.test6(5.11f);
		System.out.println("result of test6() = "+a);
		
		double d = obj.test7(11.22d);
		System.out.println("result of test7() = "+d);
		
		char c = obj.test8('P');
		System.out.println("result of test8() = "+c);
		
		boolean b = obj.test9(true);
		System.out.println("result of test9() = "+b);
		
		System.out.println("***program ends***");
	}

	public void test1() {	//when method return type is void,so void not return anything so return statement is always hide.
		System.out.println("TEST 1");
	}
	
	public byte test2() {
		byte b = 120;
		System.out.println("TEST 2");
		return 120;
	}
	
	public short test3(short k) {
		System.out.println("TEST 3");
		return k;
	}
		
	public int test4(int a,int b) {	//when return type is int,return statement return int value..
		int sum = a+b;
		System.out.println("TEST 4");
		return sum;
		//return a+b;
		//return 10;  (it will return any integer value)
	}
	public long test5(long a) {	//when return type is long,return statement return long value.
		System.out.println("TEST 5");
		return a;
	}
	public float test6(float a) {	//when return type is float,return statement return float value.
		System.out.println("TEST 6");
		return a;
	}
	public double test7(double d) {	//when return type is double,return statement return double value.
		System.out.println("TEST 7");
		return d;
	}
	public char test8(char x) {	//when return type is char,return statement return char value.
		System.out.println("TEST 8");
		return x;
	}
	public boolean test9(boolean b) {	//when return type is boolean,return statement return boolean value.
		boolean flag = false;
		System.out.println("TEST 9");
		return flag;
	}

}
