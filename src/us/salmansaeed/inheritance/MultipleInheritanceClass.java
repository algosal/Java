package us.salmansaeed.inheritance;

public class MultipleInheritanceClass extends AbstractClassMultipleInheritance{

	
	Inheritance2Interface fi = new Inheritance2Interface() {
		
		@Override
		public void hello() {
			System.out.println("Hello Method implemented from the Interface 2");
		}
		
	};

	@Override
	public void hello() {
		System.out.println("For the Main Situation");
	}
	

	
}
