package us.salman.variables;

public class mathematics {

	/**
	 * @param args
	 * //(a+b)square = (a*a) + 2ab + (b*b) 
	 * where a is an int and b is a float
	 */
	
	public static void main(String[] args) {
		int a = 25;
		float b = 42.159f; 

		//This casts before the final result and is invalid
		int leftSide = (a+(int)b)*(a+(int)b);
		System.out.println("Left Side of the Equation is " + leftSide);
		int rightSide = (a*a) + 2*a*(int)b + ((int)(b*b));
		System.out.println("Right Side of the Equation is " + rightSide);
		
		//Precision for the both sides Common Casting
		int valueRight = (int)(a*a + 2*a*(b) + (b*b)); 
		System.out.println("Value with All Cast on Right Side of the Equation " + valueRight);
		int valueLeft = (int)((a+b)*(a+b));
		System.out.println("Value with All Cast on Right Side of the Equation " + valueLeft);

		
	}

}
