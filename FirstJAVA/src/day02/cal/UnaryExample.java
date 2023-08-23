package day02.cal;

public class UnaryExample {

	public static void main(String[] args) {
		// ++,--는 1씩 증/감 처리
		int i = 1;
		int j = i++; // 후위 연산자
		
		System.out.println("후위 연산자");
		System.out.println("i의 값은: " + i); //2
		System.out.println("j의 값은: " + j); //1
		
		int x = 1;
		int y = ++x;
		
		System.out.println("\n후위 연산자");
		System.out.println("x의 값은: " + x); //2
		System.out.println("y의 값은: " + y); //2
		
	}

}
