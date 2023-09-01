package day11.innerclass;

public class University {
	
	// static 내부 클래스 사용(정적 내부 클래스)는 static이 붙은 멤버와 동일하게 사용가능
	// 내부 클래스는 외부 클래스의 모든 멤버에 접근이 가능하나 
	//	static이 붙으면 static멤버만 접근 가능
	// 접근 방식에 의해서 객체 생성 방법의 차이가 생긴다.
	// static이 없는 멤버 이너 클래스는 외부 객체를 생성한 후에 내부 클래스에 접근 가능.
	// static이 있는 멤버는 외부 클래스 객체 생성없이 바로 호출이 가능.
	
	static class Student{ // 정적 중첩 내부 클래스
		
	}
}
