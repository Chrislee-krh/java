package day08.overloading;

public class OverloadClass {
	
	// 중복의(overload) 조건
	// 1. 이름이 같아야 함.
	// 2. 접근 제한자나 반환 유형은 영향이 없다.
	// 3. 매개 변수의 유형은 달라야 한다.
	// 4. 매개 변수의 개수가 달라야 한다.
	// 5. 매개 변수의 순서가 달라야 한다.
	
	public void abc(int i, String str) {
		System.out.println("정수와 문자열이 입력됨");
	}
	
	public double abc(double a, double b) {
		System.out.println("부동 소수점이 입력됨");
		return 0.0;
	}
	
	public void abc(String str) {
		System.out.println("문자열이 입력됨");
	}
	
}
