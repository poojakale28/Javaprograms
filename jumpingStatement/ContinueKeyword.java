package jumpingStatement;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		ContinueKeyword.m1();		//static method calling
		
		System.out.println();
		
		ContinueKeyword obj = new ContinueKeyword();
		obj.m2();		// non-static method calling
	}
	public static void m1() {
		
		for(int i = 1; i <= 10;i++) {
			
			if(i == 5) {	// it will skip 5, all no.comes as it is
				
				continue; 	//"continue" is used to skip the perticular value which is pass in if statement.
			}
			
			System.out.println(i);
		}
	}
	public void m2() {
		
		for(int i = 1; i <= 10;i++) {
				
			if(i == 8 || i==9 || i==6) {	//it will skip 8,9 & remaining no come as it is. OR(||) symbol used to add more no which want to skip.
					
				continue; 	//"continue" is used to skip the perticular value which is pass in if statement.
			}
			System.out.println(i);
			
		}	
	}
}
