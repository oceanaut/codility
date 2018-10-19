package lesson1.iterations;

public class BinaryGap {
	
	public static int solution(int N) {
		
		int maxGap = 0;
		boolean firstBit = true;
		int gap = 0;
		while (N != 0) {
						int bit = N % 2;
						if (bit == 0) {
							gap++;
						} else {
										if (firstBit) {
											firstBit = false;
										} else {
											maxGap = Math.max(maxGap, gap);
										}
										gap = 0;
						}
						N /= 2;
		}
		return maxGap;
		
		
	}	
	
	public static void main(String[] args) {
		//For example, given N = 1041 the function should return 5
		System.out.println(solution(1041));
		//The number 15 has binary representation 1111 and has no binary gaps
		System.out.println(solution(15));
		//Given N = 32 the function should return 0
		System.out.println(solution(32));		
		//number 9 has binary representation 1001 and contains a binary gap of length 2
		System.out.println(solution(9));
		
	}
}
