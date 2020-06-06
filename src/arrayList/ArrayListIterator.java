package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("New York");
		list.add("Chicago");
		list.add("Mumbai");
		list.add("Delhi");
		
		System.out.println("The given cities are "+ list);
		
		Iterator<String> iter = list.iterator();
		
		System.out.println("The iterator values are ");
		while(iter.hasNext()) {
			System.out.print(iter.next());
		}

	}

}
