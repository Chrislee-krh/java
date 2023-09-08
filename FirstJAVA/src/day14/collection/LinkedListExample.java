package day14.collection;

import java.util.LinkedList;

public class LinkedListExample {

	// ArrayList는 내부 배열에 객체를 저장, 인덱스로 관리, LinkedList는 인접 참조를 링크해서 체인처럼 관리
	// LinkedList는 특정 인덱스의 객체를 제거하면 앞 뒤 링크만 변경되고, 나머지 링크는 변겨오디지 않아, 
	//	빈번한 객체의 삭제와 삽입은 ArrayList보다 좋은 성능을 발휘한다.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList(); // new LinkedList()<String> 에서 <>부분 생략가능
		
		list.add("hello");
		list.add("java");
		list.add("banana");
		list.add("apple");
		list.add("zoo");
		System.out.println(list); // [hello, java, banana, apple, zoo]
		
		list.remove(); // head element를 삭제 - list엔 remove하면 index나 객체가 들어가야하지만, 여기선 queue에서 받아왔기 때문에 remove()가 가능
		System.out.println(list); // [java, banana, apple, zoo]
		list.remove(2);
		System.out.println(list); // [java, banana, zoo]
		
		list.set(1, "new element");
		System.out.println(list); // [java, new element, zoo]
		//조회
		String str1 = list.peek(); // element 조회
		System.out.println(str1); // java
		System.out.println(list); // [java, new element, zoo]
		//위치에 따른 추가 - queue에서 받아옴
		list.addFirst("대가리");
		list.addLast("꼬랑지");
		System.out.println(list); // [대가리, java, new element, zoo, 꼬랑지]
		
		String str3 = list.poll(); // element 조회 후 삭제. peek+remove
		System.out.println(str3); // 대가리
		System.out.println(list); // [java, new element, zoo, 꼬랑지]

		String str4 = list.pop();
		System.out.println(list); // [new element, zoo, 꼬랑지]
		
		list.push("pushed element"); // push하면 추가 위치 주의.(맨 앞으로 들어감)
		System.out.println(list); // [pushed element, new element, zoo, 꼬랑지]
		
		
		
		
		
		
		
		
		
		
	}

}
