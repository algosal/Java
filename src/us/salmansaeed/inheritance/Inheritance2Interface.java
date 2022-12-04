package us.salmansaeed.inheritance;

public interface Inheritance2Interface {
	void hello();
	
	default void myMethod()
	{
		System.out.println("functional interface myMethod from Interface 2");
	}
}
