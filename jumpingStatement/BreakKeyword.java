package jumpingStatement;

public class BreakKeyword {

	public static void main(String[] args) {

		for(int i = 1; i <= 10; i++) {
			
			if(i == 8) {
				
				break;		// "break" is used to skip the loop or stop the loop after the value which is passing in if statement.
			}
			
			System.out.println(i);
		}
		
	}

}
