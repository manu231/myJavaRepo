package arrayExamples;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,4};
		int [] temp = new int [arr.length];
			
		
		int j=0 ;
		
		for(int i = 0; i<arr.length; i++) {
			
			if(i==0) {
				temp[j] = arr[i];
				System.out.println(temp[j]);
				continue;
			}
			
			if (temp[i]==  arr[i]) {
				continue;
			}
			
			if(temp[j] != arr[i]) {
				temp[++j]  = arr[i];
				//System.out.println( + temp[j]);
			}
		}
		
		for(int i = 0; i<temp.length; i++) {
			System.out.println(" AftervRemoving Duplicates"  + temp[i]);
		}
		
		

	}
	

}
