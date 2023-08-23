package day02.cal;

public class RemainderExample {

	public static void main(String[] args) {
		// +, -, *, /, %
		
		//산술 연산
		byte a = 127;	//0111_1111
		byte b = 20;	//0001_0100
		// a+b = 1001_0011(-109)
		byte c = (byte)(a+b); //147 - 128 = 19 -> 128 - 19= -109
		System.out.println("계산 결과: " + c);
		
		int a1 = 100000;
		int b1 = 100000;
		long c1 = (long)a1*b1;
		System.out.println("계산 결과 1: " + c1);
		
		int a2 = 3;
		int b2 = 2;
		double data = a2/b2; // = 1.0 뒤를 double이나 float으로 바꿔주면 1.5가 나옴. 
		System.out.println("계산 결과 2: " + data);
		// 값을 소수점 2자리까지 출력
		float pi = 3.141592f;
		float shortPi = (int)(pi*100)/100f; //int로 바꿔서 소수점 아래를 없애고(314), 100f로 나누어서 소수점을 다시 살린다.(3.14)
		System.out.println("파이 2자리까지 출력: "+ shortPi);
		
		//나머지... : 1) 배수 관계 2) 특정 범위 값을 출력
		for (int i =1; i<= 10; i++) {
			if(i%3 ==0) {
				System.out.println(i);
			}
		}
		System.out.println(3.5 % 0.3); //권장 안함
	}

}
