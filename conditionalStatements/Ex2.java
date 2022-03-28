package conditionalStatements;

public class Ex2 {	//no.is even or odd program :

	public static void main(String[] args) {
		
		int num = 15;
		
		Ex2 obj = new Ex2();
		
		boolean result = obj.method1(num);
		
		if(result==true) 
		{
			System.out.println("number is = "+result);
		}
		else {
			System.out.println("number is = "+result);
		}
}
	public boolean method1(int a) {

		boolean flag;

		if(a%2==0) {

			flag = true;
		}
		else {
			
			flag = false;
		}	
			
		return flag ; 

	}

}
