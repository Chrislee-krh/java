package day14.collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		Map<String, Integer> accounts = new TreeMap<>();
		
		accounts.put("홍길동", 10000);
		accounts.put("이순신", 50000);
		accounts.put("정준수", 90000);
		accounts.put("허현수", 70000);
		
		System.out.println(accounts);
		
		System.out.println();
		System.out.println("허현수: " + accounts.get("허현수"));
		System.out.println();
		Set<Map.Entry<String, Integer>> s = accounts.entrySet();
		for(Map.Entry<String, Integer> me : s) {
			System.out.println(me.getKey()+":"+me.getValue());  // 키값을 기준으로 정렬
		}
		
		System.out.println();
		Set<String> ss = accounts.keySet();
		for(String key : ss) {
			System.out.println(key + "::" + accounts.get(key)); // 키셋으로 불러와서, 해당 키의 값을 get(key)로 불러 전체를 출력
		}
		
	}

}
