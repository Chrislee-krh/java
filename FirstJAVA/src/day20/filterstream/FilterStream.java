package day20.filterstream;

import java.util.Arrays;
import java.util.List;

public class FilterStream {

	public static void main(String[] args) {
		// FilterStream 연습
		
		// List 객체 생성
		List<String> list = Arrays.asList("홍길동", "김유신", "홍길동", "이순신", "유관순");
		
		// distinct() 메서드를 사용하여 중복 제거 후 내부 반복자 출력
		System.out.println("distinct()");
		list.stream().distinct().forEach(s->System.out.println(s));
		
		// "홍"으로 시작하는 문자열로 필터링
		System.out.println("filter()");
		list.stream().filter(n -> n.startsWith("홍")).forEach(n -> System.out.print(n + "\t"));
		System.out.println();
		
		// 중복 제거 후 "홍"으로 시작하는 문자열 내부 반복자를 이용한 출력
		System.out.println("distinct() + filter()");
		list.stream().distinct().filter(n -> n.startsWith("홍")).forEach(n -> System.out.println(n));
		
	}

}
