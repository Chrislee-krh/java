package day15.quiz1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Participants {
	
	static String name;
	

	@Override
	public String toString() {
		return "Participants [name=" + name + "]";
	}
	
//	public static String solution(String[] participants, String[] completion) {
//		
//		Map<String, Integer> map = new HashMap<String,Integer>();
//		
//		for(String part : participants) {
//			map.put(part, map.getOrDefault(part, 0)+1);
//		}
//		System.out.println(map);
//		for(String comp: completion) {
//			map.put(comp, map.get(comp)-1);
//		}
//		
//		System.out.println(map);
		
//		Map<String, Integer> part1 = new HashMap<String, Integer>();
//		Map<String, Integer> comple1 = new HashMap<String, Integer>();
//		
//		for(int i =0; i<participants.length; i++) {
//			part1.put(participants[i], 1);
//		}
//		for(int j =0; j<completion.length; j++) {
//			comple1.put(participants[j], 1);
//		}
//		
//		for(int k = 0; k< comple1.size(); k ++) {
//			for(int l = 0; l<part1.size(); l++) {
//				if(part1.getOrDefault(, l)) {
//					System.out.println(l);
//				}	
//			}
//		}
//				
//		return fail;
	}



