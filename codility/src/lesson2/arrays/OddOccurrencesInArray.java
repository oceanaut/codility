//https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
package lesson2.arrays;

import java.util.Arrays;

public class OddOccurrencesInArray {
	
	public static int solution(int A[]) {
		
		int ret=0;
		
		for (int number : A) {
			ret ^= number;
			}
			
		
		return ret;
	}
	public static void main(String[] args) {
		System.out.println(solution(new int[] {9, 3, 9, 3, 9, 7, 9 }));

	}

}
