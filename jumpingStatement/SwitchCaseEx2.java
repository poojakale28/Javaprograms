package jumpingStatement;

public class SwitchCaseEx2 {	//when u hv specific condition then use switch case.

	public static void main(String[] args) {
		
		byte day = 5; 
		SwitchCaseEx2 obj = new SwitchCaseEx2();
		obj.WeekDay(day);
	}
	public int WeekDay(byte b) {
		
		switch (b) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		default:
			System.out.println("sunday");
			break;
		}
		
		return b;
		
	}
}
