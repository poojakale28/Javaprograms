package loopingStatements;

public class Ex5 {

	public static void main(String[] args) {

		Ex5 obj = new Ex5();
		//obj.a1();
		//obj.a2();
		//obj.a3();

	}
	public void a1() {
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
	public void a2() {
		
		for(int i = 1; i <= 10; i+=2) {	//it wil give u increment by 2 bcoz we write (i+=2) in last of for loop
		System.out.println(i);
		}
	}
	public void a3() {
		
		for(int i = 0; i <= 30; i+=5) {	//it wil give u increment by 5 bcoz we write (i+=5) in last of for loop
		System.out.println(i);
		}
	}
	
	
}
