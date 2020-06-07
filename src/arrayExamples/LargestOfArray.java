package arrayExamples;

public class LargestOfArray {

	public static void main(String[] args) {
		int[] arr = {10,33,22,44,66,12,19 };
		int val = arr[0];
		for(int i = 0; i<arr.length;i++) {
			if (arr[i ]> val) {
				val = arr[i];
			}
			System.out.println("Largest number in the goven array is " +val);
			
		}
       System.out.println("Largest number is ----" + val); 
	}

}
