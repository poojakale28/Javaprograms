package polymorphismEx;

public class MainMethod_MethodOverloadingEx {

	
	public static void main(String[] args) {	// always main access yach main method la ch asel ji sarv methods la access krte,but apn main methods different parameters pass krun create krun shkto tyala ch MethodoverLOading concept mntat.
		
		System.out.println("1");
		
		/*
		 * MainMethod_MethodOverloadingEx obj = new MainMethod_MethodOverloadingEx();
		 * obj.main(); System.out.println(obj.main(0));
		 * System.out.println(obj.main(0f));
		 */
	}
	public void main() {		// by changing different parameters,you can achieve Method Overloading. 
		
		System.out.println("2");
	}
	public int main(int a) {
		
		System.out.println("3");
		return 10;
	}
	public float main(float a) {
		
		System.out.println("4");
		return 10.0f;
	}

}
