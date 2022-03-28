package returnType;

public class Ex1 {
	
	public int addition(int a, int b) {
			int sum = a+b;
			return sum;
		// return a+b;
		//	return 10;
	}

	public static void main(String[] args) {
		
		Ex1 obj = new Ex1();
		int sum = obj.addition(2,4);
		System.out.println("addition ="+sum);

//this variable "sum" & addition method variable "sum" its not having any connection.
//main()--> variable "sum" used to capture the result of addition().Instead of sum u can take another variable name.
//addition()-->variable "sum" used to perform addition between a & b,where in main(), addition(parameter) method passing parameters.
	
		int sub = obj.subtraction(sum,3);	//int sub-->it is not necessary to capturethe result of subtraction() in int sub.
		System.out.println("subtraction ="+sub);
	}
	
	
	public int subtraction(int a,int b) {
		return a-b;
	}
}	

	/*in subtraction(),we take return type int so,return statement always return 
 * integer type of data . In main(),we passing 2 parameters,(sum,value).
 * "sum"is the variable which is capturing result of addition().
 * and in subtraction(),we passing first argument as "sum" and 2nd arg as value(which we want to pass)
 * Then main methods subtraction method goes control to [public int subtraction(int a,int b)].and int a taken "sum" and b taken values as arg
 *perform operation.and this subtraction is int type of method so,it will return int value in return statement.
 *(a-b) provide int result so,in return statement we write [return a-b].
 *this return statement give o/p as int value after performing operation,
 *and that result capture in [int sub]. when we System.out.println("subtraction ="+sub);
 *it will give us result. capturing the results of methods, in main() is not necessary.
 *if we need then only capture. 
 */
	
	
