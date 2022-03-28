package pragramEx;

public class ReverseString {

	public static void main(String[] args) {

		String name = "pooja";
		String reverse = "";
		
		int leng = name.length();	
		
		for(int i = leng-1 ; i >= 0 ; i--) {
			
			reverse = reverse + name.charAt(i);
			
		}
		
		System.out.println("reverse of "+name+" : "+reverse);
		
	}

}
