package day02;

public class intTypeExample {

	public static void main(String[] args) {
		byte a = (byte)129; // -> -128, byte a = 128;  -128 ~ 127
		short b = (short)32769; // -> -32768, short b = 32768;  
		int c = 2147483647; //int c = 2147483648; 방법은 형 변환
		long d = 2147483648L; //long d = 2147483648 
		
		/*
		 * 형변환 (type casting)
		 * - 데이터의 크기
		 * byte(1) < short(2) < int(4) <long(8) < float(4) < double(8) 
		 * - 여기서 float이 더 큰 이유는 차지하는 bit의 수는 작지만, 부동소수점으로 할당시킨 bit들이 표현할 수 있는 숫자의 크기가 훨씬 커진다.
		 * - 작은 타입은 큰 타입으로 캐스트 연산자를 사용하지 않아도 자동으로 적용된다. - 자동(묵시적) 형 변환, promotion이라고 부른다
		 * - 크기가 큰 데이터 타입을 작은 타입으로 변환할 땐, 반드시 캐스트 연산자((type))로 변환할 데이터 타입을 명시해야한다. - 강제 형 변환, type casting이라 부른다.
		 * 		-하지 않으면 컴파일 에러
		 * - 서로 다른 타입의 연산을 진행하면, 두 데이터 중 큰 데이터 타입으로 자동 형 변환된 후, 연산 진행
		 * - int형보다 작은 데이터 타입의 연산이 발생하면 자동으로 int형으로 형 변환이 일어남.
		 */
		
		System.out.printf("%d, %d, %d, %d\n", a, b, c, d);
		
		
		
	}

}
