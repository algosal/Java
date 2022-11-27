package us.salman.variables;

import java.math.BigDecimal;

/**
 * @author Salman
 *
 */
public class variables {


	public static void main(String[] args) {

		int a;
//must have a value otherwise will give java.lang.Error exception
		a=1;
		System.out.println(a);
		
		//32 bytes in memory
		//7 decimals precision
		float f = 1;
		System.out.println(f);
		
		//double is the float with double precision i.e 64 bytes
		//double works faster than float, so prefer double
		//16 digits precision
		double d = 1;
		System.out.println(d);
		
		boolean b = true;
		System.out.println(b);
		
		char c = 'a';
		System.out.println(c);
		
		char uniCh = '\uF609';
		System.out.println(uniCh);
		
		//round-off error in Java
		double roundOffErrorDouble1 = 1.05;
		double roundOffErrorDouble2 = 2.55;
		System.out.println(roundOffErrorDouble1+roundOffErrorDouble2);
		
		//Solution is BigDecimal Class
		BigDecimal bD1 = new BigDecimal("1.05");
		BigDecimal bD2 = new BigDecimal("2.55");
		System.out.println(bD1.add(bD2));
		System.out.println(bD1.subtract(bD2));
		
		
		
		//Strings: A sequence of Characters
		String s = "salman \u00BB";
		System.out.println(s);
		
		String strConv ="100";
		//Parsing to Integer from String
		System.out.println(100 + Integer.parseInt(strConv));
		
		char [] chToStrArr = {'a','b','c'}; 
		
		String chToStr = new String(chToStrArr);
		System.out.println(chToStr);
		
		//Type Casting - Explicit
		int x = 10;
		//short y = x; //gives an error
		short y = (short)x; 
		System.out.println("Type Casting Took Place Here " + y);
		
		
	}

}
