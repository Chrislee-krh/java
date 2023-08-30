package day09.encapsulation;

import day09.encapsulation.singleton.Company;

public class SingletoneExample {

	/*
	 * Singleton Design Pattern
	 * 
	 * private 제한자와 static 제한자를 사용, 클래스의 인스턴스 개수를 제한하는 프로그래밍 방법
	 * 단 하나의 객체로 연결해서 처리하고 싶을때 사용. (무거워지지 않게)
	 */
	
	public static void main(String[] args) {
		// 싱글톤은 new를 사용하지 않는다. 메서드를 이용해서 객체 생성 //이때 메서드를 클래스 메서드라고 부른다. 클래스.메서드() 이런식이다.
		Company c1 = Company.getCompany();
		Company c2 = Company.getCompany();
		
		System.out.println(c1);
		System.out.println(c1==c2);
		System.out.println(c2);
		
		
	}

}
