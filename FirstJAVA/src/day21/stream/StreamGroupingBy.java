package day21.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import day20.stream.order.Circle;
import day20.stream.order.Rectangle;
import day20.stream.order.Shape;

public class StreamGroupingBy {

	public static void main(String[] args) {
		// GroupingBy() : Map객체로 생성!
		
		Shape s1 = new Rectangle(10,3);
		System.out.println("s1의 getClass값" + s1.getClass()); // s1의 getClass값class day20.stream.order.Rectangle
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20,2);
		Shape s4 = new Circle(11);
		
		List<Shape> list = Arrays.asList(s1,s2,s3,s4);
		
		try {
			// 객체 타입으로 그룹핑(Rectangle, Circle)
			Map<Object, List<Shape>> map = list.stream().collect(Collectors.groupingBy(f->f.getClass()));
			// groupingBy는 그룹핑기준을 getClass()를 사용. getClass는 해당 객체의 클래스값
			// Object에 그 값이 들어간다.(객체 자체가 키가 됨)
			
			System.out.println("사각형 출력");
			map.get(Class.forName("day20.stream.Rectangle")).stream()
			.forEach(f -> System.out.println(f));
			
			System.out.println("원 출력");
			map.get(Class.forName("day20.strea.Circle")).stream()
			.forEach(f -> System.out.println(f));
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
