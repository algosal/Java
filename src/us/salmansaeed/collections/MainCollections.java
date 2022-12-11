package us.salmansaeed.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class MainCollections {

	public static void main(String[] args) {
		ArrayListClass aLC = new ArrayListClass();
		//Integer i = 0;
		aLC.aL.add("Salman");
		aLC.aL.add("Salman1");
		aLC.aL.add("Salman2");
		aLC.aL.add("Salman3");
		aLC.aL.add(2,"Sal"); 
		System.out.println(aLC.aL);
		//aLC.aL.set(2,"salmanns"); 
		/*System.out.println(aLC.aL);
		System.out.println(aLC.aL.get( aLC.aL.indexOf("Salman")));
		aLC.aL.remove("Salman3"); */
		Collections.sort(aLC.aL);
		System.out.println(aLC.aL.contains("Sal"));
		System.out.println(aLC.aL.iterator().next());
		
		
		
		
		
		//aLC.aL.clear();
		System.out.println(aLC.aL);
		
		// Creating another ArrayList
        ArrayList<String> sec_list = new ArrayList<>();
          
        // using Clone() Method
        sec_list = (ArrayList)aLC.aL.clone();
        System.out.println(aLC.aL == (sec_list));
        System.out.println(aLC.aL.equals(sec_list));
        aLC.aL.add("Original_List OBJ");
        System.out.println(aLC.aL.equals(sec_list));
        sec_list.add("sec_list obj");
        System.out.println(aLC.aL.equals(sec_list));
        System.out.println(sec_list);
        System.out.println(aLC.aL);
        System.out.println(aLC.aL.toArray()[3]);
        System.out.println(aLC.aL.size());
        System.out.println(aLC.aL.equals(sec_list));
		
        System.out.println("********************");
        MainCollections mC = new MainCollections();
        mC.readList(sec_list);
        
        ArrayList<Integer> integer_list = new ArrayList<>();
        integer_list.add(1);
        integer_list.add(2);
        mC.readList(integer_list);
        
				
	}
	
    
	
	public <T> void readList(List<T> l) {
		for (T t : l) {
			System.out.println(t);
		}
	}

}
