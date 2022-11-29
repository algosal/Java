package us.salmansaeed.loops;

public class WhileLoop {

	public static void main(String[] args) {

	int i = 1;
	char con = 's';
	
	while(con=='s') {
		for(;i<=10;i++) {
			if(i>=6) {
				con = 'e';
				continue; 
			}
			System.out.println("value of i is " + i + " condition now is " + con);
		}
		
		for(int j=1; j<6 ; j++) {
		for(int stars = 0; stars < j ; stars++)
			System.out.print("*");
		System.out.println();
		}
		
		for(int k=5; k > 0 ; k--) {
			for(int stars = k; stars > 0 ; stars--)
				System.out.print("*");
			System.out.println();
			}
	}
	
	}

}
