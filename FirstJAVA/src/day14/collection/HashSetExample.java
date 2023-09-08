package day14.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// ** 해싱: 하나의 문자열을 보다 빨리 찾을 수 있도록 주소에 직접 접근할 수 있는 짧은 길이의 값이나 키로 변환
		//			이 값을 이용해서 문자열을 메모리에 저장
		//			검사 시 문자열을 비교하는 것이 아니라 해시값을 비교하기 때문에, 한 번에 검색이 가능
		//			문자열의 형태와 해시값은 전혀 연관성이 없기 때문에, 메모리상 여러 곳에 흩어져 저장된다.
		
		Set set = new HashSet<>();
		
		set.add("three");
		set.add("one");
		set.add("two");
		set.add("four");
		set.add("five");
		set.add("new Integer(4)");
		boolean isAdded = set.add("five");
		System.out.println(set); // [four, one, new Integer(4), three, two, five]
		System.out.println(isAdded); // false. 이미 있어서
		System.out.println(set.size()); // 6
		
		set.remove("two");
		System.out.println(set); // [four, one, new Integer(4), three, five]
		
		set.clear();
		System.out.println(); // 비었어
		
		if(set.isEmpty()) {
			System.out.println("비었어");
		}
		
		
	}

}
