import java.util.*;
import java.util.Arrays;


public class scoville {

	public static void main(String[] args) {
		int scoville[] = new int[]{1, 2, 3, 9, 10, 12};
		int K=7;
		
		System.out.println(Solution(scoville, K));
		
		
	}

	public static int Solution(int[] scoville, int K) {
		int answer=0;
		
		while(true) {
		
			Arrays.sort(scoville);
			if(scoville[answer] < K) {
				scoville[answer+1] = scoville[answer+1]*2 + scoville[answer];
				scoville[answer] = 0;
				answer += 1;
			}else
				break;
			if(answer >= scoville.length-1)
				break;
		}
		
		return answer;
		
	}

}
