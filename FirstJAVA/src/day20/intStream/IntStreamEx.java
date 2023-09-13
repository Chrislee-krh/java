package day20.intStream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamEx {

	public static void main(String[] args) {
		// IntStream의 range(), rangeClosed() 메서드 사용
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("Arrays.stream() IntStream 생성");
		
		IntStream intstream1 = Arrays.stream(arr);
		intstream1.forEach(s -> System.out.println(s+"\t"));
		System.out.println();
		
		System.out.println("IntStream.of() IntStream 생성");
		IntStream intstream2 = IntStream.of(arr);
		intstream2.forEach(s -> System.out.println(s+"\t"));
		System.out.println();
		
		// 두번째 매개변수 인덱스 포함 안함
		System.out.println("IntStream.range() IntStream 생성");
		IntStream intstream3 = IntStream.range(10, 16);
		intstream3.forEach(s -> System.out.println(s+"\t"));
		System.out.println();
		
		// 두번째 인덱스 포함
		System.out.println("IntStream.rangeClosed() IntStream 생성");
		IntStream intstream4 = IntStream.rangeClosed(10, 16);
		intstream4.forEach(s -> System.out.println(s+"\t"));
		System.out.println();
		
		
		
	}

}
