package constructorEx;	//  constructor is used for memory allocation,also it is use to initilize the non-static global variables

public class Ex1 {

	/*	public Ex1() {
		
		System.out.println("Default Constructor");
	}	*/
	
	
	public static void main(String[] args) {
		System.out.println("***program starts***");
			
			Ex1 obj = new Ex1();	//if we create obj and not create any constructor,then java created "default constructor" by its own default constructor is blank.so in o/p nothing is print.	
		
		System.out.println("***program ends***");

	}
}


/*if u create obj of class automatic default constructor is create and it is hidden. 
but if user write any constructor explicitly , then java not create default constructor by its end.
now i create default constructor and Create object of class, that created obj giving call to explicit created constructor 
which is created by me automatic and print the msg in that constructor */