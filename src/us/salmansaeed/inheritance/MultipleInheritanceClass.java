package us.salmansaeed.inheritance;

public class MultipleInheritanceClass extends AbstractClassMultipleInheritance{

	

	@Override
	public void hello() {
	System.out.println("Hello implemented in MultipleInheritanceClass");	
	}

	
/*	
	Inheritance2Interface fi = new Inheritance2Interface() {
		
		@Override
		public void hello() {
			System.out.println("Hello Method implemented from the Interface 2");
		}
		
	};
*/
	

	public static void main(String[] args) {
		Inheritance2Interface fi = ()->{System.out.println("Hello Method implemented from the Interface 2 in main with Lambda");};		
		fi.hello();
		fi.myMethod();
		MultipleInheritanceClass mic = new MultipleInheritanceClass();
		mic.hello();
		mic.myMethod();
	}
	
	
	

		

	
}
