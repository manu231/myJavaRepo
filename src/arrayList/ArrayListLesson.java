package arrayList;

import java.util.List;
import java.util.ArrayList;

public class ArrayListLesson {

	public static void main(String[] args) {
		
		List<Integer> listOne = new ArrayList<>();
	   
		listOne.add(100);
		listOne.add(150);
		System.out.println("List one is : " +listOne.get(0) + " " +listOne.get(1));
		
		ArrayList<String> str = new ArrayList<>();
		
		//add elements to list
		str.add("Manohar");
		str.add("Tarun");
		str.add("Bindu");
		
	//delete elements
		str.remove(0);
		
	//retrieve elements
		System.out.println(str.get(0));
			
	//update elements
		
	    str.set(0, "Arjun");

	    System.out.println(str.get(0));
	    
	    // AutoBoxing is the automatic conversion of primitive data type to an object --- int to Integer
	    
	    List<Integer> li = new ArrayList<>();
	    
		for(int i = 0; i<=10; i++) {
			//li.add(i);
			li.add(Integer.valueOf(i));
			System.out.println(li.get(i));
		}
		
		//UnBoxing ---- 
		
		List<Integer> ub = new ArrayList<>();
		
	}
	
}
