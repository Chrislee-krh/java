package day15.quizAnswer1;

import java.util.PriorityQueue;

public class CollectionQuiz2 {



	public static void main(String[] args) {
		int[] scoville = {1,2,3,9,10,12};
		int K = 7;
		System.out.println("음식을 최소 몇 번 섞었을 때 원하는 맵기가 될까?" + solution(scoville, K));
		
		
	}

	public static int solution(int[] scoville, int K) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int num : scoville) {
			pq.add(num);
		}
		int get = 0;
		int mixCnt = 0;
		
		int snd = 0;
	
		while(true) {
//			for(int i = 0; i<scoville.length; i++) {
			if(pq.size()>1 && pq.peek()<K) {
				int fst = pq.poll();
				snd = pq.poll();
				get = fst + (snd*2);
				
				pq.add(get);
				
				mixCnt ++;
			} else if(pq.peek()>=K) {
				break;
			}
			
			
		}
		return mixCnt;
	}		
//		scoville_get = 	scoville[i] + scoville[i+1]*2
		
}
