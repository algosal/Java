package us.salman.variables;

public class Incrementals {

	public static void main(String[] args) {

		// post or prefix does not matter here because
		/**
		 * @Comments and args for the "for" Loop The initialExpression initializes
		 *           and/or declares variables and executes only once. The condition is
		 *           evaluated. If the condition is true , the body of the for loop is
		 *           executed. The updateExpression updates the value of
		 *           initialExpression. The condition is evaluated again.
		 */
		for (int i = 0; i < 5; ++i) {
			System.out.println(i);
		}

		boolean x = true;
		boolean y = false;
		boolean z = true;

		if ((x && y) && (x && z)) {
			System.out.println("All is True");
		} else {
			System.out.println("It did not work");
		}

		// Ternary Operator
		String ternaryCheckX = (true) ? "it is true" : "it is false";
		System.out.println(ternaryCheckX);

		// Assignment Operators
		int assignmentOperatorX = 5;
		System.out.println(assignmentOperatorX += 5);
		System.out.println(assignmentOperatorX *= 5);
		System.out.println(assignmentOperatorX -= 5);
		System.out.println(assignmentOperatorX /= 5);
		System.out.println(assignmentOperatorX %= 5);
		
		
		//incremental testing
		/*Special Case for Post-increment operator: 
		 * If we assign the post-incremented value to the same
		 *  variable then the value of that variable will not 
		 *  get incremented i.e. it will remain the same as it was before. 
		 *  Example: a = a++; Here, the value of 'a' is 3 then 
		 *  the value of 'a' will be not changed because the value 
		 *  of 'a' gets assigned to the post-incremented value of 'a' 
		 *  Note: This special case is only with post-increment and 
		 *  post-decrement operators, while the pre-increment and 
		 *  pre-decrement operators works normal in this case.
		 * */
	    
			System.out.println("The Incremental behavior outside the for loop");
		 
			int a=3;
		    a=a++;
		    System.out.println("Post-Increment a: " +a);
		 
		    a=++a;
		    System.out.println("Pre-Increment a: "+a );
		 
		    a=a--;
		    System.out.println("Post-Decrement a: " +a);
		 
		    a=--a;
		    System.out.println("Pre-Decrement a: "+a );
		    

	}
}
