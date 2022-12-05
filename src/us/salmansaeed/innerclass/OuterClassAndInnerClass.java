package us.salmansaeed.innerclass;

public class OuterClassAndInnerClass {

	public InnerClass ic = new InnerClass();
	
	public class InnerClass{
		private String s ="This is Coming from the Inner Class";
		
		public void printInnerClass(){
			System.out.println(s);
		}
	}
	
}
