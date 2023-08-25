package day06;

public class ObjectBasic1 {

	public static void main(String[] args) {
		// 객체 지향 - 현실 세계의 모든 것을 객체로 간주하고, 이 객체를 속성과(멤버 변수.attribute), 행위(메서드)를 갖는 소프트 웨어적 개념으로 표현한 것!
		// 연필이란 물체(클래스)에는 연필의 색깔, 굵기라는 속성(멤버 변수)
		// 연필의 쓰는 기능(메서드)
		
		// 클래스는 객체를 만들기 위한 "설계도 또는 명세서"라고 할 수도 있음.
		//  - 실제 물체의 추상화를 통해 프로그램에서 사용할 수 있는 코드 형태로 만들어 둔 것!
		
		// 객체의 명사적 특징은 변수(멤버 변수), 필드, 속성
		// 객체의 동사적 특징은 메서드, 행위, 기능
		

		
		Calculator calc1 = new Calculator();
		calc1.add(10);		
		int result = calc1.result;
		System.out.println(calc1);
		Calculator calc2 = new Calculator();
		System.out.println(calc1.equals(calc2));
		
	}

	// 1번 계산기
	static int result1 = 0;
	static int add1(int n) { // 메서드
		result1 += n;
		return result1;
	}
		
	// 2번 계산기
	static int result2 = 0;
	static int add2(int n) { // 메서드
		result1 += n;
		return result1;
	}
	
	// 3번 계산기
	static int result3 = 0;
	static int add3(int n) { // 메서드
		result1 += n;
		return result1;
	}
	
}
