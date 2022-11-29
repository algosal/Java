package us.salmansaeed.loops;

public class SumOfDigits {

	public static void main(String[] args) {

		int a = 12345;
		int r;
		r = 0; 
		while(a>0) {
			
				r = r + a%10;
				a = a/10;

		}
		System.out.println(r);
	}

}
