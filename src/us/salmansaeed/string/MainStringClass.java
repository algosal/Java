package us.salmansaeed.string;

public class MainStringClass {

	/**methods of Strings are available online
	 * 
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**String literals
		 * 
		 */
		String s ="Salman";
		String g =" is a good guy";
		String t = s.concat(g);//concatenation
		
		/**New Keyword creates a new reference
		 * 
		 */
		String str = new String("Hello World");
		
		
		System.out.println(t.chars().count()
				+ " is the number of characters" + str);
		
		
		System.out.println(t);
		
		if(t.equals("Salman is a good guy")) {
			System.out.println("The String is equal");
		}else {
			System.out.println("String is not equal");
		}
		
		System.out.println(t.codePointAt(2));
		//System.out.println(t.format(t, ));
		System.out.printf("The String object %s is at hash code %s%n", s, "22");

		
	}
}
