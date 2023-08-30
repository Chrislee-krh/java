package day09.static_;

public class Staticinit {
	
	static { // 생성자가 실행되기 전에 실행. 스태틱 변수 초기화. 객체를 여러번 생성해도, 한 번만 실행(생성자와는 다르다)
		System.out.println("static initializer가 수행됨");
	}

	public Staticinit() {
		System.out.println("Constructor 호출됨");
	}
	
}
