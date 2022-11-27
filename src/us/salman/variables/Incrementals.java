package us.salman.variables;

public class Incrementals {

	
	public static void main(String[] args) {

		//post or prefix does not matter here because
		/**
	 * @Comments and args for the "for" Loop
	 * The initialExpression initializes and/or declares variables and executes only once.
	 * The condition is evaluated. If the condition is true , the body of the for loop is executed.
	 * The updateExpression updates the value of initialExpression.
	 * The condition is evaluated again.
	 */
		for(int i = 0; i < 5; ++i) {
			System.out.println(i);
		}
		
		boolean x = true;
		boolean y = false;
		boolean z = true; 
		
		if((x&&z)&&(x&&y)) {
			System.out.println("All is True");
		}else {
			System.out.println("It did not work");
		}
		
		
	}
}
