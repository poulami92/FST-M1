package activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {

	public static void main(String[] args) {
		
		Set<String> hs = new HashSet<String>();
		
		hs.add("mango");
		hs.add("apple");
		hs.add("orange");
		hs.add("banana");
		hs.add("guava");
		hs.add("lichi");
		
		System.out.println("Size of Set: " + hs.size());
		
		System.out.println("Apple removed :"+hs.remove("apple"));
		
		System.out.println("papaya removed :"+hs.remove("papaya"));
		
		System.out.println("Is lichi is in list: " + hs.contains("lichi"));	
		
		System.out.println("New Updated Set :");
		
		for(String s:hs) {
	    	 
	    	 System.out.println(s);
	     }

	}

}
