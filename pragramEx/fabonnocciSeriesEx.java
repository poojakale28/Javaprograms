package pragramEx;	// 0  1  1  2  3  5 ---> here a=0,b=1 & c=a+b means c=0+1=1 , nextTime a=1,b=1 & c=a+b means c=1+1=2, nextTime a=1,b=2 & c=a+b means c=1+2=3.

// use the logic of swapping numbers program 

// Fabonnocci Series me 0+1=1 hoga, fir nextTime 1+1(jo o/p h) = 2, fir nextTime 1+2(jo o/p h) = 3,  fir nextTime 2+3(jo o/p h) = 5 hoga.


public class fabonnocciSeriesEx {

	public static void main(String[] args) {

		int a = 0, b = 1;
		int c;
		
		for( int i = 1; i <= 10; i++) {
			
			 c = a + b ; 
			 System.out.println(c);
			  
			 a = b;		// because of swapping 'a' have now 'b' value
			 b = c;		// because of swapping 'b' have now 'c' value. and 'c' become empty.
			 
// so, now we consider 'b' as 'a' so new value of 'a' put in 'b'. & we consider 'c' as 'b' so new value of 'b' put in 'c'. and loop will execution will continue.		 
			
		}
		
	}

}
