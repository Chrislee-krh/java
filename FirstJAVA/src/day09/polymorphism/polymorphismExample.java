package day09.polymorphism;

public class polymorphismExample {

	public static void main(String[] args) {
		// 다형성 테스트
		Person p = new Student("홍길동", 17,"20230001","도술");
		p.walk();	// 부모 클래스인 Person에 있는 메서드
//		p.study(); 	// p는 다형적 객체이므로, 부모 클래스에 있는 메서드만 사용가능해.
		Student casting = (Student) p;
		casting.study();
		
	}

}
