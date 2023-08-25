package day06;

// 클래스를 사용하는 경우?
// - 대량 반복적 코드 사용시, 미리 틀을 만들어 사용하는 경우
// - 코드를 최소화하여 작업하기 위해서..

// 	구조(틀)
/*	<modifiers-접근제한자> class <className> {
 * 			ClassBody;
 * 			//attributes -멤버변수, 속성, 필드
 *			//constructors - 생성자
 *			//methods - 메서드, 행위, 기능
 * 	}
 * 
 * 	속성: 객체가 가지고 있는 명사적 특성.
 * 	생성자: 클래스를 통해 객체를 생성하기 위해서 사용하는 것.
 * 	메서드: 객체가 가지고 있는 동사적 특성
 * 
 * 	<modifiers>: 제한자로 public, protected, default(공백), private 등으로 접근 접근 레벨을 지정
 * 		- public: 같은 패키지가 아니어도 어느 클래스에서나 참조 가능
 * 		- protected: 같은 패키지 내에 클래스에서만 참조 가능, 자식 클래스가 다른 패키지에 있을 경우, 그 자식도 참조 가능
 * 		- default: 같은 패키지 내애 클래스에서만 참조 가능.
 * 		- private: 같은 클래스 내에서만 참조 가능.
 */

 class Calculator { 	//default 접근 제한자
	
	int result = 0; 	
	int add(int n) {
		result += n;
		return result;
	}

}
