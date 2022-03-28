package ArrayEx;

public class Ex2 {

	public static void main(String[] args) {
		
	/*	int[][] a = new int[3][3];
		
		a[0][0] = 2;
		a[0][1] = 3;
		a[0][2] = 5;
		a[0][0] = 10;
		a[0][1] = 6;
		a[0][2] = 4;
		a[0][0] = 1;
		a[0][1] = 0;
		a[0][2] = 9;	*/
		
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		
		
		for(int i = 0 ; i<3 ; i++) {
			
				for(int j=0; j<3 ;j++) {
					
					System.out.println("a["+i+"]["+j+"] ="+a[i][j]);
				}
			
				System.out.println();
			
		}
		
	}

}
