package day20.stream.map;

import java.util.Arrays;

public class StreamOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArr[] = {10,20,30,40,50,60};
		//.asDoubleStream 부분을 .asLongStream, .asIntStream등으로 상황에 맞춰 바꿀 수 있다.
		Arrays.stream(intArr).asDoubleStream().forEach(d -> System.out.println(d));
		System.out.println();
		
		// Stream<Integer>
		Arrays.stream(intArr).asDoubleStream().boxed()
			.forEach(i -> System.out.println(i.getClass()));
		// Stream<Integer>
		Arrays.stream(intArr).boxed()
			.forEach(i -> System.out.println(i.getClass()));
	}
}
