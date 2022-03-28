package MethodPractice;

public class Para3 {

	public static void main(String[] args) {
		ArithmaticEx3 obj = new ArithmaticEx3();
		obj.additionofIF(20, 45);
		obj.additionofIF(10, 22.7f);
		obj.additionofFI(41.10f, 5);
		obj.additionofDF(45.22, 57.3f);
		obj.additionofBB((byte)2, (byte)2);	//otherwise it is consider as int so type casting is required
		obj.additionofSS((short)38, (short)15);	//it is explicitly mention type casting when we send values in byte and short
		obj.test1('A');
		obj.test2(true);
	}

}
