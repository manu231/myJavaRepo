package arrayExamples;

import java.util.Arrays;

public class RemoveDuplicatesUnsortedArray {

	public static void main(String[] args) {
		int [] arr = {2,4,1,8,4,2,3,1,4,1};
		int [] temp = new int [arr.length];
		int j=0;
		Arrays.sort(arr);
		System.out.println("Added to see changes in Jenkins");
		for(int i=0; i<arr.length-1;i++) {
			if(arr[i] !=arr[i+1]) {
				arr[j++] = arr[i];
			  System.out.println("Value is : " +arr[j]);
			}
			
		}
		
		arr[j++] = arr[arr.length-1];
		for(int k=0; k<j; k++) {
			System.out.println(arr[k] +"");
		}

	}
  
}
