package day08.overloading;

public class OverloadExample {

	public static void main(String[] args) {
		// 오버로드 테스트
		OverloadClass object = new OverloadClass();
		object.abc(100, "자바");
		double d = object.abc(10.0, 11.0);
		System.out.println(d);
		object.abc("자바");
		object.abc(100, 200); // 자동 형 변환으로 double이 됐음.
	}

}
