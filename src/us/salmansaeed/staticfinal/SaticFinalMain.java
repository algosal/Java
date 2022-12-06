package us.salmansaeed.staticfinal;

public class SaticFinalMain {

	public static void main(String[] args) {
		/**
		 * final class cannot be extended
		 */
		
		FinalClass fc = new FinalClass();
		fc.hello();
		
		/**
		 * final members can be initialized by a constructor 
		 * and that is why they are not the constants
		 */
		
		FinalMember fm = new FinalMember(100);
		System.out.println(fm.getX());
		
		/**
		 * final methods cannot be overriden 
		 */

	}

}
