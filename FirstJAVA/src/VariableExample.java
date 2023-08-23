
public class VariableExample {

	public static void main(String[] args) {
		// 변수의 값 대입: 변수 = 값;
		// "=" 대입 연산자. "==" 동등의 기호
		// 좌변에 우변에 있는 값을 대입한다는 뜻.
		
		int a = 1;
		int b = 2;
		a = a + b;
		System.out.println(a);
		System.out.println(b);
		
	}

	/*
	 * 메서드 형식
	 * 	<return type> <method-name> (parameter_list) {
	 * ...
	 * }
	 * 
	 * return_type: 메서드 블록 내에 실행한 결과를 반환하는 형태 지정
	 * 				반환 값은 "return"명령어를 마지막에 사용함. 반환 값이 없을 경우 void를 사용한다.
	 * 
	 */
	
	public void test() { //public private protected default 접근 제한자, void: return type, test: method-name
		int a = 0;
			System.out.println("a의 초기값: " + a);
	}
}
