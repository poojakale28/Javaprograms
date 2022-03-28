package conditionalStatements;

public class Ex3 {				//MarkSheet result program:

	public static void main(String[] args) {
		int marks = 84;
		Ex3.Result(marks);
	}
	
	public static int Result(int marks) {
		
		if(marks>=70) {
			System.out.println("student is pass with DISTICTION");
		}
		else if(marks>=60) {
			System.out.println("student is pass with FIRSTCLASS");
		}
		else if(marks>=55){
			System.out.println("student is pass with SECOND CLASS");
		}
		else if(marks>=40) {
			System.out.println("PASS CLASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		return 0;
		
		
	}

}
