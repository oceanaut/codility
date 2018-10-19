package lesson2.arrays;

import java.util.Arrays;

public class CyclicRotation {
	
	public static int[] solution(int arr[],int K) {
		int retA[] = new int[arr.length];	
		if (arr.length==0) {
			return arr;
		}else {
			for (int i = 0; i < arr.length; i++) {
			int a=(i+K)%arr.length;
			retA[a]=arr[i];
			}
			
		}
		
		return retA;
	}
	

	public static void main(String[] args) {
		//the function should return [6, 3, 8, 9, 7].
		System.out.println(Arrays.toString(solution(new int[] {3, 8, 9, 7, 6 },1)));
		//the function should return [9, 7, 6, 3, 8].
		System.out.println(Arrays.toString(solution(new int[] {3, 8, 9, 7, 6 },3)));
		//the function should return [0, 0, 0]
		System.out.println(Arrays.toString(solution(new int[] {0, 0, 0 },1)));
		//the function should return [1, 2, 3, 4]
		System.out.println(Arrays.toString(solution(new int[] {1, 2, 3, 4 },4)));
		 

	}

}
