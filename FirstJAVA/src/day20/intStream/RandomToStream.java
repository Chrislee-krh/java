package day20.intStream;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class RandomToStream {

	public static void main(String[] args) {
		// Random.ints()
		System.out.println("int형 난수 스트림: ");
		// ints(3) 3개
		IntStream isr = new Random().ints(3);
		isr.forEach(s -> System.out.print(s+" "));
		System.out.println();
		
		// ints(개수, initial inclusive, last exclusive)
		isr = new Random().ints(10, 0, 3);
		isr.forEach(s -> System.out.print(s+" "));
		System.out.println();
		
		System.out.println("long형 난수 스트림");
		// longs(개수, initial inclusive, last exclusive)
		LongStream lsr = new Random().longs(3, 0, 10);
		lsr.forEach(s -> System.out.print(s+ " "));
		System.out.println();
		
		System.out.println("Double형 난수 스트림");
		// doubles(개수, initial inclusive, last exclusive)
		DoubleStream dsr = new Random().doubles(3, 0, 10);
		lsr.forEach(s -> System.out.print(s+ " "));
		System.out.println();
		
	}

}
