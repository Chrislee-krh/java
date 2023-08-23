package day02.cal;

public class LogicalExample {

	public static void main(String[] args) {
		// 논리 연산자 ^, &, |, &&, ||
		int x = 10, y = 20;
		System.out.println("(x != 10)&(++y == 21)의 결과: "
				+((x != 10)&(++y == 21)));
				System.out.println("x: " + x + ", y: "+y);
		
		System.out.println("(x != 10)|(++y == 22)의 결과: "
				+((x != 10)|(++y == 22)));
				System.out.println("x: " + x + ", y: "+y);
	
		//short cut	
		int a = 10, b = 20;
		System.out.println("(a != 10)&&(++b == 21)의 결과: "
				+((a != 10)&&(++b == 21)));
				System.out.println("a: " + a + ", b: "+b);
		// &&는 앞의 것을 확인하고 나서 false인 걸 알았기 때문에, b부분은 skip하기 때문에 a:10, b:20
		// a와 b의 순서를 바꾸면, a= 10, b: 21로 나온다.		
		System.out.println("(a != 10)||(++b == 21)의 결과: "
				+((a != 10)||(++b == 21)));
				System.out.println("a: " + a + ", b: "+b);
		
		System.out.println("(a == 10)||(++b == 22)의 결과: "
				+((a == 10)||(++b == 22)));
		System.out.println("a: " + a + ", b: "+b);
	}

}
