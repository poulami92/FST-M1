package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args) {

          Map<Integer,String> colors = new HashMap<Integer,String>();
          
          colors.put(1, "Red");
          colors.put(2, "Green");
          colors.put(3, "Yellow");
          colors.put(4, "Black");
          colors.put(5, "White");
          
          System.out.println("Map: " + colors);
          
          colors.remove(3);
          
          System.out.println("Is Green is in list: " + colors.containsValue("Green"));	
          
          System.out.println("New Size of map: " + colors.size());
		
	}

}
