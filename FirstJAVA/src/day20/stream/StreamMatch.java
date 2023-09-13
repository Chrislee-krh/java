package day20.stream;

import java.util.Arrays;
import java.util.List;

import day20.stream.order.Circle;
import day20.stream.order.Rectangle;
import day20.stream.order.Shape;

public class StreamMatch {

	public static void main(String[] args) {
		// 요소 조건 검사: Stream 내부에 있는 요소들의 특징의 조건을 만족하는지 검사할 수 있는 메서드
		// allMatch(Predicate P): 요소 모두가 조건 P를 만족하면 true
		// anyMatch(Predicate P): 하나라도 만족하면 true
		// noneMatch(Predicate P): 
		
		Shape s1 = new Rectangle(10,3);
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20,2);
		Shape s4 = new Circle(11);
		
		List<Shape> list = Arrays.asList(s1,s2,s3,s4);
		
		// 모든 요소들이 Shape의 인스턴스(객체)인지 조건 비교
		boolean result = list.stream().allMatch(a -> (a instanceof Shape));
		System.out.println("모두 Shape객체" + result);
		// 요소들 중에 하나 이상이 Rectangle 객체인지 조건 비교
		boolean result2 = list.stream().anyMatch(a -> (a instanceof Rectangle));
		System.out.println("Rectangle객체가 존재" + result);
		//모든 요소가 Circle의 객체인지 조건에 해당하지 않은지 비교
		boolean result3 = list.stream().noneMatch(a -> (a instanceof Circle));
		System.out.println("Circle객체가 존재하지 않는다." + result);
	}
}
