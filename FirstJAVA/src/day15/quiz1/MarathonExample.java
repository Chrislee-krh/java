package day15.quiz1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MarathonExample {

	public static void main(String[] args) {
		
//		List<String> partList = new ArrayList<String>();
//		List<String> compleList = new ArrayList<String>();
		
		String[] participants = {"leo", "chris", "lisa","leo"};
		String[] completion = {"leo","chris","lisa"};
		
		
		System.out.println(solution(participants, completion));
	}

		public static String solution(String[] participants, String[] completion) {
		
		Map<String, Integer> map = new HashMap<String,Integer>();
		
		Set<String> fail = new HashSet<>();
		
		for(String part : participants) {
			map.put(part, map.getOrDefault(part, 0)+1);
		}
		System.out.println(map);
		
		for(String comp: completion) {
			map.put(comp, map.get(comp)-1);
		}
		System.out.println(map);
		
		for(Map.Entry<String, Integer> array : map.entrySet()) {
			if(array.getValue()>0) {
//			if(map.containsValue(1)) {
			 fail.add(array.getKey());
		}
		
		
		}
		return fail.toString();
	}

}






