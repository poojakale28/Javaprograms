package stringEx;		// compareTo() & compareToIgnoreCase()

public class Ex2 {

	public static void main(String[] args) {

		String s2 = "Delhi";
		String s3 = "Delhi";
				 
		System.out.println(s2.compareTo(s3));	
//compareTo()--> return result in integer. compareTo() change string in unicode value. if s2 & s3 difference is +ve, means s2>s3. if s2 & s3 difference is -ve, means s2<s3.
		
		String str = "a";		//unicode value for a is 97
		String str1 = "A";		//unicode value for A is 65.
		
	// "str-str1" result is +ve then comapreTO() return str>str1.
	// "str-str1" result is -ve then comapreTO() return str<str1.
		
		System.out.println("str.compareTo(str1) : "+str.compareTo(str1));		// difference between 97-65=31. "31" is "+ve" means str>str1.
		
		String str2 = "B";		//unicode value for B is 66
		String str3 = "b";		//unicode value for b is 98
		
	System.out.println("str2.compareTo(str3) : "+str2.compareTo(str3));		// 66-98 = -32 . "32" is "-ve" means str2<str3.
//----------------------------------------------------------------------------------------------------------------------------------
	
	System.out.println("str.compareToIgnoreCase(str1) :"+str.compareToIgnoreCase(str1));		//compareToIgnoreCase() --> ignore upperCase,lowerCase.
	
	}

}
