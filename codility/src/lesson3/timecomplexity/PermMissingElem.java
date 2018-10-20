package lesson3.timecomplexity;

//https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
//Detected time complexity:
//O(N) or O(N * log(N))

//large_range
//range sequence, length = ~100,000
//WRONG ANSWER
//got -2147483647 expected 1 

//large2
//large test, length = ~100,000
//WRONG ANSWER
//got -2147473647 expected 10001 

// the same code in python passes without wrong answer

public class PermMissingElem {

	public static int solution(int[] A) {		
			int N=A.length+1;
			int missing=((N+1)*N)/2;
			for (int x : A) {
						missing-=x;
			}	
		return missing;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] {2, 3, 1, 5 }));
		System.out.println(solution(new int[] {}));
		
	

	}

}
