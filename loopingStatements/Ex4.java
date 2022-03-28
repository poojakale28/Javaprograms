package loopingStatements;

public class Ex4 {

	public static void main(String[] args) {
		
		Ex4 obj = new Ex4();
		
		//obj.m1();		// non-static methods calling
		//obj.m2();
		//obj.m6();
		//obj.m7();
		//obj.m8();
		//obj.m9();
		
		//Ex4.m3();			// static methods calling
		//Ex4.m4();
			
	}
	public void m1() {
		
		for(char c ='a' ; c <= 'z'; c++) {
			
			System.out.println((int)c);
		
		}
	}
	public void m2() {
		
		for(char c ='A' ; c <= 'Z'; c++) {
			
			System.out.println((int)c);
		
		}
	}
	public static void m3() {
		
		for(char c ='A' ; c <= 'Z'; c++) {
			
			System.out.println(c);
		
		}
	}
	public static void m4() {
		
		for(char c ='a' ; c <= 'z'; c++) {
			
			System.out.println(c);
		
		}
	}
	public void m6() {
		
		for(char c ='Z' ; c >= 'A'; c--) {
			
			System.out.println(c);
		
		}
	}
	public void m7() {
		
		for(char c ='Z' ; c >= 'A'; c--) {
			
			System.out.println((int)c);
		
		}
	}
	public void m8() {
		
		for(char c ='z' ; c >= 'a'; c--) {
			
			System.out.println(c);
		
		}
	}
	public void m9() {
	
	for(char c ='z' ; c >= 'a'; c--) {
		
		System.out.println((int)c);
	
	}
}
}



