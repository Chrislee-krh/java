package day15.compare;

import java.util.HashSet;
import java.util.TreeSet;

public class ObjectEqualsExample {

	public static void main(String[] args) {
		// 객체간 동등 비교
		Dog d1 = new Dog("진돗개", "뽀삐", 15);
		Dog d2 = new Dog("말티즈", "삐삐", 5);
		Dog d3 = new Dog("진돗개", "뽀삐", 15);
		
		// Dog d3 = d1;
		System.out.println(d1 == d3);
		System.out.println(d1.equals(d3));
		System.out.println(d1);
		System.out.println(d3);
		
		// HashSet은 동등비교를 통해서 같은 객체인지 아닌지 비교!  // equals와 hashCode override하지 않았다면, 같은 객체라 생각치않고 set에 들어간다.
		HashSet<Dog> set = new HashSet<Dog>();
		System.out.println(set.add(d1));
		System.out.println(set.add(d2));
		for(Dog dog : set) {
			System.out.println(dog);
		}
		
		// TreeSet: 정렬의 기준이 있는 tree인데 기본 데이터 아닌 사용자가 만든 객체로 비교를 하려니 기준점이 없어 정렬이 안되는 상황.
		TreeSet<Dog> tset = new TreeSet<>();
		System.out.println(tset.add(d1));
		System.out.println(tset.add(d2));
		for(Dog dog : tset) {
			System.out.println(dog);
		}
		
	}

}
