package arrayExamples;

import java.util.Arrays;

public class ArrayDeletion {

	public static void main(String[] args) {
		//Once an array is declared then we cannot delete an elements.
		// THe only way is to copy it to another array of less size.
		// For example delete an element at index 2.
		
		int []  originalArray = {10,20,30,40,50};

	
		// Print the original array 
		System.out.println(" Original Array is : " +Arrays.toString(originalArray));
		
		//index at which element in the array need to be removed
		int rm_index = 2;
		System.out.println("Element to be removed at index : " +rm_index);
		System.out.println("Added to see changes in GitHubDeskTop");
		/*
		 * // Check,If the array is empty or index is out of bounds
		 *  If ( originalArray
		 * == null ) //|| rm_index<0 //|| rm_index > originalArray.length) {
		 * System.out.println("No removal operation is possible"); }
		 */	
		//Create  a copy of an Array
		int[] proxyArray = new int [originalArray.length-1];
		
		for(int i=0, k=0; i<originalArray.length; i++) {
			if (i== rm_index) {
				continue;
			} 
			proxyArray[k++] = originalArray[i] ;
		}
           System.out.println("Array after removal operation" +Arrays.toString(proxyArray));
	}

}
