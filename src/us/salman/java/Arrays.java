package us.salman.java;


public class Arrays {
	
	private int [] intArray = new int[5];
	{
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		intArray[3] = 4;
		intArray[4] = 5;
		}
	
	private String [] strArray = new String[2];
	{
	strArray[0] = "Hello";
	strArray[1] = "World"; 
	}
	
	
	
	public void intArrPrt() {
				
		for (int i : intArray) {
			System.out.println(i);		
			}
	}
	
	public void strArrPrt() {
		for (String s : strArray) {
			System.out.println(s);			
		}
	}

}
