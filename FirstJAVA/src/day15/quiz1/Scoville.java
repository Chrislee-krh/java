package day15.quiz1;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Scoville {
	
	public static void main(String[] args) {
	
		int[] scoville = {1,2,3,9,10,12};
		System.out.println("시도횟수: " + solution(scoville, 6));
		
	}
		
		
	public static int solution(int[] scoville, int K) {
		int mixCnt = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int n : scoville) {
			pq.add(n);
		}
		
		while(true) {
			mixCnt++;
			int result = pq.poll() + pq.poll()*2;
			pq.add(result);
			if(result>K) return mixCnt;
			if(pq.size()<2) return -1;		
		}
	}

	

	
	
	
}

