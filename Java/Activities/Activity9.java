package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) {

     List <String> myList = new ArrayList<String>();
     myList.add("Rohit");
     myList.add("Anshu");
     myList.add("John");
     myList.add("Merry");
     myList.add("Robert");
     
     for(String s:myList) {
    	 
    	 System.out.println(s);
     }
     
     System.out.println("3rd Element in List : "+myList.get(2));
     System.out.println("Is John is in list: " + myList.contains("John"));	
     System.out.println("Size of ArrayList: " + myList.size());
     
     myList.remove("Merry");
     
     System.out.println("New Size of ArrayList: " + myList.size());
	}

}
