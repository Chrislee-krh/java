package day15.generic;

import java.util.ArrayList;

public class GenericExample {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		ArrayList<String> genericList = new ArrayList<>();
		
		list.add("first");
		list.add("second");
		list.add(new Integer(4));
		list.add(new Float(5.0f));
		
		genericList.add("first");
		genericList.add("second");

		// 제네릭을 사용하면 지정된 타입이외의 다른 타입은 저장할 수 없음.
//		genericList.add(new Integer(4));
		
		// Object타입이기 때문에 String 캐스팅 필요
		String s1 = (String)list.get(0);
		// 이미 String이라 캐스팅 필요 없음.
		String s2 = genericList.get(0);
		System.out.println(s1);
		System.out.println(s2);
		for(String s : genericList) {
			System.out.println(s);
		}
	}

}
