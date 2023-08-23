package day02.cal;

public class AssignmentExample {

	public static void main(String[] args) {
		// 대입 연산자: 기본 부호 "="
		// 복합 대입 연산자: x operand = a -> e.g.) x += 10; -> x =  x + 10;
		
		int a = 5;
		int b = 5;
		a += 3; // a = a + 3;
		b =+ 3; // b = +3; 이렇게 작성하면 안된다. -> b = 3이란 뜻이 됨.
		
		System.out.println(a+"\t"+b);
		
	}

}
