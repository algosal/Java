package us.salmansaeed.inheritance;

public class Person {
	private int eyes;
	private int ears;
	private int mouth;
	public Person(int eyes, int ears, int mouth) {
		super();
		this.eyes = eyes;
		this.ears = ears;
		this.mouth = mouth;
		this.toString(); 
	}
	public int getEyes() {
		return eyes;
	}
	public int getEars() {
		return ears;
	}
	public int getMouth() {
		return mouth;
	}
	
	@Override
	public String toString() {
		return "Person [eyes=" + eyes + ", ears=" + ears + ", mouth=" + mouth + "]";
	}
	
	
}
