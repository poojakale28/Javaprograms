package polymorphismEx;

// polymorphism types-->1]MethodOverloading(require 1 class) 2]MethodOverriding(require 2 class)
// MethodOverloading,only depend on passing parameters & i/p given by user.
/* MethodOverloading depend on --->
 * 1] by changing number of parameters
 * 2]by changing position of parameters
 * 3]by changing dataTypes of parameters
 */

public class MethodOverloading {	// method overloading can perform in one class.
	
	public void addition() {
		int a = 10, b = 20;
		System.out.println(a+b);
	}
	public int addition(int a,int b) {	// method 1,2,3 having different parameters
		return a+b;
	}
	public int addition(int a,int b,int c) {
		return a+b+c;
	}
	public int addition(int a, float b) { //method 4,6 having interchange position of parameters
		return (int)(a+b);
	}
/*	public float addition(int a, float b) { // method 4,5 having same method name,same count of parameters,and same datatypes parameters but only different return type in between methods.but it's showing error.means different return type will not going to change scenario.
		return (float) (a+b);
	}	*/
	public int addition(float a, int b) {
		return (int)(a+b);
	}
	public int addition(float a, float b) {	// method 2,7 having same parameter count ,but different dataypes pass in parameters
		return (int)(a+b);
	}
	

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.addition();  //return type of this method is void so, don't write in SOP
		System.out.println("addition of int,int = "+obj.addition(7, 2));
		System.out.println("addition of int,int,int = "+obj.addition(4, 5, 4));
		System.out.println("addition of int,float = "+obj.addition(20, 7.2f));
		System.out.println("addition of float,int = "+obj.addition(10.69f, 40));
		System.out.println("addition of float,float = "+obj.addition(11.44f, 2.02f));
	
	}

}

/*MethodOverloading --> require one class.
1]  having same name of all methods
2] but different datatypes can pass as parameter which make methods different
3] number of parameter should be change in every method
4]change the position of parameters
*/