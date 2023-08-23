
public class LocalVariableExample {

	public static void main(String[] args) {
		/*
		 * 변수 선언 방법
		 * <type> <variableName>;
		 * <type> <variableName> = <초기값>;
		 * 
		 * -type : 저장할 데이터의 유형을 알리기 위해, 이미 정의된 자료형 키워드
		 * 		기본 타입: 정수(byte, short, int, long)
		 *		부동 소수점형(float,double)
		 * 		논리형(boolean), 문자형(char)
		 * -variableName: 변수의 이름(식별자)
		 * 
		 * 변수 초기화 방법
		 * 		<variableName> = <literal>;
		 * 		-초기화: 변수를 선언하면, 메모리에 그 변수를 위한 공간을 할당
		 * 			      이 할당된 공간에 처음 값을 입력하는 것을 초기화라고 함.
		 * 		-리터럴(literal): Java내에서 데이터값을 그대로 쓴 상수를 의미
		 * 
		 */
		
		int a = 0; //지역 변수 - 지역 변수는 블럭 내에서 선언된 변수로 블럭 밖에선 사용 불가, 사용할 때 반드시 초기화가 필요하다. int a; 이렇게 쓰는건 필드 작성때만 가능.
		System.out.println(a);
			
	}
}
