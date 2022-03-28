package stringEx;	// equal() -> used for content comparison. &  " == "-> operator used for address comparison.  

public class Ex1 {

	public static void main(String[] args) {
		
//		String obj = "pune";	// these are 2 ways for declaring string,but in such type of declaration, ur object create in only SCP.
//		String obj1 = new String("pune");	// here ur obj create in both SCP and Heap Area.

		String s = new String("Hydrabad");
		String s1 = new String("Hydrabad");
		String s2 = "Delhi";
		String s3 = "Delhi";
		
		System.out.println("s==s1 :"+(s==s1));		// false, "==" use for address/ reference comparison. s & s1 point different different object in Heap Area of same name. 
		System.out.println("s2==s3 :"+(s2==s3));		// true, used for Content/ data comparison. s3 & s4 point same object in SCP.
		
		System.out.println("s.equals(s1) :"+s.equals(s1));		// true,used for Content/ data comparison.both contain same data
		System.out.println("s2.equals(s3) :"+s2.equals(s3));		// true,used for Content/ data comparison.both contain same data
	
		System.out.println("s==s2 :"+ s==s2);		//false, because 's' point to Heap Area & 's2' point to SCP
		System.out.println("s.equals(s2) :"+ s.equals(s2));	//false, 's' contain "Hydrabad" & s2 contain "Delhi".

//------------------------------------------------------------------------------------------------------------------------------
		
		String str = "pune";	
		String str1 = "Pune";
		
		System.out.println("str.equals(str1) : "+str.equals(str1));	//equal() always check font, and check data.
		System.out.println("str.equals(str1) : "+str.equalsIgnoreCase(str1)); //equalsIgnoreCase() ignore upperCase & lowerCase,only check data.
		
//----------------------------------------------------------------------------------------------------------------------------------
		
		
		
		
	
	}
	
	
	

}
