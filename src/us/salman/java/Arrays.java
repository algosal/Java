package us.salman.java;

<<<<<<< HEAD
import java.awt.geom.Point2D;

import java.awt.Point;

public class Arrays {
	
	protected int [] intArray = new int[5];
=======
public class Arrays {
	
	private int [] intArray = new int[5];
>>>>>>> a56eb633e2059b6c2a71ffe9ccd91b490a39173e
	{
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		intArray[3] = 4;
		intArray[4] = 5;
		}
	
<<<<<<< HEAD
	
	
=======
>>>>>>> a56eb633e2059b6c2a71ffe9ccd91b490a39173e
	private String [] strArray = new String[5];
	{
		strArray[0] = "1A";
		strArray[1] = "2B";
		strArray[2] = "3C";
		strArray[3] = "4D";
		strArray[4] = "5E";
		}
<<<<<<< HEAD

	
	public void intArrPrt() {
		
		Point p1 = new Point(0,1);
		Point p2 = new Point(1,3);

			System.out.println((p2.getY() - p1.getY())/(p2.getX() - p1.getX()));
			

				
		for (int i : intArray) {
			System.out.println(i);		
			}
=======
	
	
	
	public void intArrPrt() {
		for (int i : intArray) {
			System.out.println(i);			
		}
>>>>>>> a56eb633e2059b6c2a71ffe9ccd91b490a39173e
	}
	
	public void strArrPrt() {
		for (String s : strArray) {
			System.out.println(s);			
		}
	}

}
