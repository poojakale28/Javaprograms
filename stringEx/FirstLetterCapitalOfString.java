package stringEx;		//every word first letter capital of string.

public class FirstLetterCapitalOfString {

	public static void main(String[] args) {
		
		String s = "there is garden and it is beautiful";

		String[] ar = s.split(" ");		//split()-->we pass space there, from space its move next word on next line. which is we pass from that it moves next letter on next line.
		
		//	String[] ar1 = s.split("i");	// "i" psn next line wr every wr move zla, ani "i" remove zla.
			
		for(int i = 0; i < ar.length ;i++) {
			  
		System.out.println(ar[i]);
			 
		}
		
/*		char c = ar[0].charAt(0);		//'t'
		String str = String.valueOf(c).toUpperCase();		//"T"
		System.out.println(str);	//this gives me first word ka first letter capital i.e.,"T"
		String str2 = ar[0].substring(1, ar[0].length()); 		// first word.substring(1,first word ka length)
		String word = str+str2;					//"T" + "here" = "There
		System.out.println(word);		*/ 		//this logic for first word.
		
		
//		String word1 = String.valueOf(ar[0].charAt(0)).toUpperCase()+ar[0].substring(1, ar[0].length());	//lineno.19 - 24 logic in one line
		
		String str = "";
		
		for(int i = 0; i < ar.length ; i++)
		{
		   str = str + String.valueOf(ar[i].charAt(0)).toUpperCase() + ar[i].substring(1, ar[i].length()) + " ";
			
		}
		
		System.out.println(str);
		
	}

}
