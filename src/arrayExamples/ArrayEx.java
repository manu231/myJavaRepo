package arrayExamples;

public class ArrayEx {

	public static void main(String[] args) {
		
		// Type [] arrayname = {1,2,3,3}
		
		int [] arr1 = new int [4]; // Array Declaration   0,0,0
		
		arr1[0] = 10;
		arr1[1] = 11;
		arr1[2] = 12;
		
		System.out.println(arr1.toString());
		
		 // traversing of an array 
		for(int i = 0; i<arr1.length; i++) {
			System.out.println("With out intialising of an array:  " +arr1[i]);
		}
		
		// enhanced for loop
          for(int value : arr1)	{
        	  
        	  System.out.println("Enhanced for loop is : " +value);
          }
		
		
		int [] arr = {10,11,12,13,14,12,11,55}; // This is called array initialization
		
		
		String [] vehicle = {"Honda","Toyota"};
		
	   
		
		
				
		// Enhanced for loop
		// i is temporary variable
	    for(int i : arr1 )  {
	    	
	    	System.out.println(i);
	    }
	    
		//System.out.println(vehicle[0]);
		
		//System.out.println("Array Length : " +arr.length);
		
		for(int i = 0;i<arr.length;i++) {
			
			//System.out.println(arr[i]);
		}
		
		// Enhanced for loop
		//for(type variable : arrayname)
		for(int  k : arr) {
			//System.out.println("Enhanced for loop  " +k);
		}
		
		// nested for loops
		
		int [] [] numbers = { {1,4,7,8}, { 8,9,10}    };
		
		for(int i = 0; i<numbers.length; i++)
			 for(int j=0; j < numbers[i].length ; j++)
				 System.out.println(numbers[i][j]);
			}
	
}
