package day15.quiz1;

import java.util.HashMap;

public class Marathon {
	
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
		HashMap<String, Integer> map = new HashMap<>();
		String answer = "";
		for(String p: participants) {
			map.put(p, map.getOrDefault(p, 0)+1);
		}
		
		for(String p: completion) {
			map.put(p, map.get(p)-1);
		}
		
		for(String key : map.keySet()) {
			if(map.get(key)!=0)
				answer = key;
		}
		return answer;
	}
	
}
