package day08.objectclass;

import day08.inheritance.Person;

public class ObjectExample {

	public static void main(String[] args) {
		Object obj = new Object(); //최상위 객체
		obj.hashCode(); // 객체 동등 비교를 위해서
		obj.equals(obj); // 객체 동등 비교를 위해 재정의
		obj.toString(); // 기본적으로 클래스명@hashcode 값으로 출력
						// 재정의해서 객체 내의 정보를 확인하기 위한 용도로 사용
		
		Person p1 = new Person(20, "홍길동");
		Person p2 = new Person("홍길동", 20, 185.0f);
		System.out.println(p1.hashCode()); //54151643
		System.out.println(p2.hashCode()); //54151643
		System.out.println("p1과 p2의 비교 결과: "+(p1.hashCode() == p2.hashCode())); //true
		
		day08.inheritance.overriding.Person o1 = new day08.inheritance.overriding.Person();
		
		day08.inheritance.overriding.Person o2 = new day08.inheritance.overriding.Person();
		System.out.println("o1의 hashCode 값: " + o1.hashCode()); //1392838282
		System.out.println("o1의 hashCode 값: " + o2.hashCode()); //523429237

		Person p3 = new Person();
		System.out.println(new String("Hello").hashCode()); //69609650
		System.out.println("Hello".hashCode());				//69609650
		System.out.println(p3.hashCode());  
		
		System.out.println(p1.equals(p2)); //true
		System.out.println(p1.toString()); //[name=홍길동, age=20]
		System.out.println(p1); //[name=홍길동, age=20]
	}


}
