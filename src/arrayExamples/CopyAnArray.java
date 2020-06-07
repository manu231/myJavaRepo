package arrayExamples;

public class CopyAnArray {

	public static void main(String[] args) {
	  		
		//source  i
		char[] copyFrom = {'a','b','c','d'};
		// {d,c    }
		//char [] copyTo = new char[copyFrom.length];
		
		// Destination  j
		char [] copyDestination = new char[copyFrom.length];
		
		int j=0;
		//System.out.println(copyFrom.length);
		for (int i = copyFrom.length-1; i >= 0; i--) {
			copyDestination[j] = copyFrom[i];
			j++;
			System.out.println("J after iteration" + j);
			System.out.println("Reverse Method " +copyDestination[j-1]);
		}
		
		for(int  i= 0; i<copyDestination.length; i++) {
			System.out.println(copyDestination[i]);
		}
		
		
		
		
		}
	
	     // reverse of an array
	
	

	}


