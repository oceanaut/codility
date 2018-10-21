package lesson3.timecomplexity;
//https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
//Detected time complexity:O(1)

public class FrogJmp2 {

	public static int solution(int X, int Y, int D) {
		return (int)Math.ceil((double)(Y-X)/D);
	}
	public static void main(String[] args) {
		System.out.println(solution(10, 85, 30));

	}

}
