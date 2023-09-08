package day15.quizAnswer1;

import java.util.HashMap;

public class CollectionQuiz1 {

	public static void main(String[] args) {
		String[] first_pa = {"leo", "kiki", "eden", "leo", "leo"};
		String[] second_pa = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] third_pa = {"imislav", "stanko", "mislav", "ana"};
		String[] first_com = {"leo", "kiki", "leo"};
		String[] second_com = {"mairna", "josipa", "nikola","filipa"};
		String[] third_com = {"stanko","mislav", "ana"};
		
		System.out.println("첫번째 사례: " + solution(first_pa,first_com));
		System.out.println("2번째 사례: " + solution(second_pa,second_com));
		System.out.println("3번째 사례: " + solution(third_pa,third_com));
		
	}
	public static String solution(String[] participants, String[] completion) {
		String answer = "";
		HashMap<String, Integer> hm = new HashMap<>();
		for(String player: participants) hm.put(player, hm.getOrDefault(player, 0)+1);
		for(String player: completion) hm.put(player, hm.get(player) - 1);
		
		for(String key: hm.keySet()) {
			if(hm.get(key) != 0)
			answer = key;
		}
		
		return answer;
	}
}
