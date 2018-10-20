package lesson3.timecomplexity;
//https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
//Detected time complexity:
//O(N) or O(N * log(N))

public class PermMissingElem2 {
	
	public static int solution(int[] A) {
		int sum=0,sum1=0;
		for (int i = 1; i < A.length+2; i++) {
			sum+=i;
		}
		for (int i = 0; i < A.length; i++) {
			sum1+=A[i];
		}
		return sum-sum1;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] {2, 3, 1, 5 }));

	}

}
