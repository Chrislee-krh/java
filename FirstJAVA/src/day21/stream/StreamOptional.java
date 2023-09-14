package day21.stream;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StreamOptional {

	public static void main(String[] args) {
		// 집계함수 -> count, sum 제외 모두 Optional타입
		int[] arr = new int[100];
		for(int i=0; i<100; i++) {
			arr[i] = i+1;
		}
		
		// 리턴값 long
		long count = Arrays.stream(arr).count();
		System.out.println("요소들의 개수: " + count);
		// 리턴갑 int
		int sum = Arrays.stream(arr).sum();
		System.out.println("요소들의 합: " + sum);
		// OptionalInt 클래스, xxxdouble, xxxlong, ...
		OptionalInt first = Arrays.stream(arr).findFirst();
		// 결과: OptionalInt[1] -> getAsInt() 옵셔널 인트에서 int로 빼내는 작업
//		System.out.println("요소의 첫 번째 값: " + first);
		System.out.println("요소의 첫 번째 값: " + first.getAsInt()); //1
		
		OptionalInt max = Arrays.stream(arr).max();
		System.out.println("요소들 중 최대 값: " + max.getAsInt()); //100
		OptionalInt min = Arrays.stream(arr).min();
		System.out.println("요소들 중 최대 값: " + min.getAsInt());
		
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println("요소들의 평균: " + avg.getAsDouble()); //50.5
		
		// OptionalXXX 클래스들은 기능이 거의 유사함
		// isPresent() 	- 반환 타입 boolean, 값이 존재하는지 체크
		// orElse(T)	- 반환 타입 T(지정하는 대로 T로 정해짐), 기본값 설정
		// ifPresent(Consumer) - 반환타입 void, 값이 존재하는 경우 Consumer처리
		
		System.out.println("Optional 주요 메서드 연습");
		// 요소가 없는 빈 ArrayList 객체 생성
		java.util.List<Integer> list = new ArrayList<>();
		
		long count1 = list.stream().count();
		System.out.println("요소 개수: " + count1);
		// 위의 stream은 int[]라서 intStream이고, 여긴 Integer stream임. 그래서 mapToInt(Integer필요)
		long sum1 = list.stream().mapToInt(Integer::intValue).sum(); 
		System.out.println("요소들의 합: " + sum1);
		
		// 옵셔널들은 element가 있어야 출력 -> isPresent 필요
		OptionalDouble avg2 = list.stream().mapToInt(Integer::intValue).average();
		if(avg2.isPresent()) {
//		System.out.println("요소들의 평균: " + avg2); // orElse(0)없으면 OptionalDouble Empty가 뜬다.
		System.out.println("요소들의 평균: " + avg2.getAsDouble()); // 요소가 존재하지 않아서 NoSuchElementException
		}
//		OptionalInt max2 = list.stream().mapToInt(Integer::intValue).max().orElse(0);// Integer에서 orElse(0) 안됨. 
		int max2 = list.stream().mapToInt(Integer::intValue).max().orElse(0);
//		if(max2.isPresent()) {
//		System.out.println("요소들 중 최대 값: " + max2.getAsInt());
//		}
		
		//ifPresent는 반환타입이 void라서 OptionalInt first2 등의 객체만들기는 해선 안됨.
		list.stream().mapToInt(Integer::intValue).findFirst()
			.ifPresent(a -> System.out.println("요소의 첫번째 값: " + a));
		
		
	
		
		
		
		
	}
}