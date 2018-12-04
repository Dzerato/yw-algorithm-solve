import java.util.*;
import java.util.PriorityQueue;



public class scoville2 {

	public static void main(String[] args) {
		int scoville[] = new int[]{1,1,0};
		int K=7;
		
		System.out.println(Solution(scoville, K));
		
		
	}

	public static int Solution(int[] scoville, int K) {
		
		int answer=0;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(int i=0; i<scoville.length; i++)
			pq.add(scoville[i]);
		
		System.out.println(pq.size());


		while(!pq.isEmpty()) {
			


			if(pq.peek() < K) {
				int min1 = pq.poll();
				int min2 = pq.poll() * 2 + min1;
				pq.add(min2);
				answer += 1;
			}else
				break;
			
			if(pq.size() < 2 && pq.peek()<K)
			{
				answer = -1;
				break;
			}
			
		}
		return answer;
		
	}

}
