package abstractionEx;


abstract class a5	{		// parent cls

/*	public void test1() {
		
	}*/
	
	abstract public void test2();
	
	
}

abstract public class Ex3 extends a5{
	
	abstract public void test2(); 
// copy of non-static data of parent cls is coming here(before main method of child cls). abstract method mule ata child cls pn abstract karava lgel mg apn tyavha obj bnvu shknar nh.
		
	public static void main(String[] args) {
		
//		Ex3 obj = new Ex3();	// as u make ur child cls abstract u can't make obj of child cls.
	}

}
