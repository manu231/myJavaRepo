package arrayExamples;

import org.junit.Assert;
import org.junit.Test;



public class CodilityTest {
   
	public int solution(int[] A) {
		int maxNum = A[0]; // 111 take maxNum = 0;
		
		for (int i = 0; i<A.length; i++ ) {
			/*
			 * if(A.length ==0 || A== null) { System.out.println("Array is empty"); }
			 */
				if(maxNum < A[i]) {
				maxNum = (Math.abs(A[i]) >= 0 && Math.abs(A[i]) < 10) ? A[i]:maxNum;
				//maxNum = ((A[i]) >= -10 && (A[i]) < 10) ? A[i]:maxNum;
			}
		}
		
		return maxNum;
	}
	//public static void main(String[] args) {
	@Test
	public void testSolution() {
		CodilityTest obj = new CodilityTest();
		int [] A = {};
		int[] B = {8,9,9,9,9,11,122,9,8,2,3,5,3,9,10,11,4,-22,66,-44 };
		int [] c = {-9};
		
		int [] c1 = {-5,11};
		int [] c2 = {8,5,4,8,9,9,0,-7,-2};
		int [] c3 = {-6,11,12,222,3333,-100};
		int [] c4 = {-8,-4,-100,100};
		int [] c5 = {1,4,3,2,8,1000};
		int [] c6 = {0,100,200};
		int [] c7 = {9,200,300,500};
		
		//Assert.assertEquals(9, obj.solution(B));
		
		Assert.assertEquals(-9, obj.solution(c));
		
		Assert.assertEquals(-5, obj.solution(c1));
		
		Assert.assertEquals(9, obj.solution(c2));
		
		Assert.assertEquals(-6, obj.solution(c3));
		
		Assert.assertEquals(-4, obj.solution(c4));
		
		Assert.assertEquals(8, obj.solution(c5));
		
		Assert.assertEquals(0, obj.solution(c6));
		
		Assert.assertEquals(9, obj.solution(c7));
		
		//Assert.assertEquals(9, obj.solution(c8));
		//int result_empty = obj.solution(A);
		
		/*
		 * int result_positive = obj.solution(B); System.out.println("Result is  : "
		 * +result_positive);
		 * 
		 * int result_negative = obj.solution(c); System.out.println("Result1 is  : "
		 * +result_negative);
		 */	

	}
	
	@Test
	public void testMinValue() {
		CodilityTest obj = new CodilityTest();
		int[] B = {8,9,9,9,9,11,122,9,8,2,3,5,3,9,10,11,4,-22,66,-44 };
		Assert.assertEquals(9, obj.solution(B));
	}

}
