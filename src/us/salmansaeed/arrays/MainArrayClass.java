package us.salmansaeed.arrays;

public class MainArrayClass {

	public static void main(String[] args) {
		ArrayClass ac = new ArrayClass();
			
			for(int i = 0; i < ac.arrayVar.length; i++)
				ac.arrayVar[i] = i;
			for (int s : ac.arrayVar) {
				System.out.println(s);
			}
	}

}
