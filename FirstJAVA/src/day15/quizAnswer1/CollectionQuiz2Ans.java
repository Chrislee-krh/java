package day15.quizAnswer1;

import java.util.PriorityQueue;

public class CollectionQuiz2Ans {

	public static void main(String[] args) {
		int[] scoville = {1,2,3,9,10,12};
		
		System.out.println("음식을 최소 몇 번 섞었을 때 원하는 맵기가 될까?" + solution(scoville, 6));
		
		
	}
	
	public static int solution(int[] scoville, int K) {
		int answer = 0; // 시도 횟수
		
		PriorityQueue<Integer> que = new PriorityQueue<Integer>();
		for(int i : scoville) {
			que.add(i);
		}
		
		while(true) {
			answer++; // 시도 첫 번째
			int result = que.poll() + (que.poll()*2);
			que.add(result);
			// 정해진 맵기 K값을 넘어서는 섞은 음식인 경우. 그 회차를 반환
			if(que.peek()>= K) return answer;
			// K 이상으로 만들 수 없는 경우 반환 값은 -1
			if(que.size() == 1) return -1;
		}
		
		
	}
}
