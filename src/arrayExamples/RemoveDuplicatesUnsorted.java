package arrayExamples;

public class RemoveDuplicatesUnsorted {

	public static void main(String[] args) {
		int [] arr = {4,7,1,4,3,7};
		int [] temp = new int [arr.length] ;
		
		
		// Traverse given array
		for(int i=0; i<arr.length; i++ ) {
	      for(int j=i+1;j<arr.length;j++)	{
	    	  if(arr[i]==arr[j]) {
	    		  System.out.println("Duplicate values are : --" + arr[i] + "--" + arr[j]);
	    	  }
	    		      }
			
		}

	}

}
