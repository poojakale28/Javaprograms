package stringEx;			//String Methods :

public class Ex3 {

	public static void main(String[] args) {
		
		String s = "there is garden and it is beautiful";
		
		System.out.println("charAt() : "+(s.charAt(4)));		// indexing start from 0 , and charAt() return character from the index which is we pass.
		
		System.out.println("concat() : "+(s.concat("java")));	//concat() --> used to join string, u can use "+" operator instead concat().
		
		System.out.println("+ operator : "+(s+"java"));		// it work like concat.
		
		System.out.println("endsWith() : "+s.endsWith("ful"));	//endsWith() --> return result in true/false.[boolean result]
		
		System.out.println("indexOf() : "+s.indexOf("g"));		//indexOf()--> use to get index of particular element.
		
		System.out.println("indexOf() : "+s.indexOf("is"));		// we pass "is" but, it will give index of "i" with"i", where "s" is present with "i".
		
		System.out.println("isEmpty() : "+s.isEmpty());			//isEmpty() --> return result in true/false. check string is empty or not.

		System.out.println("lastIndexOf : "+s.lastIndexOf("i"));	//lastIndexOf()--> return last count of letter which is we pass.
		
		System.out.println("length() : "+s.length());		//length()--> give length of whole string.
		
		System.out.println("replace() : "+s.replace("i", "Z"));		//replace() --> all "i" in string replace with "z".
		
		System.out.println("replace() : "+s.replace("garden", "sea"));	//replace() --> letter,word,string can be replace with desire letter,word,string.
		
		System.out.println("replaceFirst() : "+s.replaceFirst("is", "was"));	//replaceFirst() --> in string, first "is" is replace with "was" & remaining is stay as it is.
		
		System.out.println("startsWith() : "+s.startsWith("t"));		//startsWith()--> use to check passing letter,word is at start of string or not. return result in true/false
		
		System.out.println("startsWith() : "+s.startsWith("there"));		// it will check upperCase & lowerCase.
		
		System.out.println("substring() : "+s.substring(3, 15));		//substring() --> with the help of substring, we can create new string by passing (from int,to int)
		
		System.out.println("toLowerCase() : "+s.toLowerCase());		//toLowerCase() --> whole string convert in lowerCase
		
		System.out.println("toUpperCase() : "+s.toUpperCase());		//toUpperCase() --> whole string convert in UpperCase
		
		System.out.println("trim() : "+s.trim());		//trim() -> with help of trim(),u can remove spaces from starting & ending of string.
}
	}
