package day09.final_;

public class FinalLocalVariableExample {

	public int data = 100;
	
	public static void main(String[] args) {
		new FinalLocalVariableExample().doIt("홍길동"); //스태틱이 아닌 애를 호출하려니 객체를 만들어낸다.

		
	}

	public void doIt(final String name) { 
		final int age = 38;	//파라미터로 final을 썼으니, 내부에서도 final 쓰는 걸 권장 받는다.
		class InnerLocal {
			public void innerDoIt() {
				System.out.println("외부 클래스의 멤버 변수 data: " + data);
				System.out.println("외부 클래스의 파라미터 변수 name: " + name);
				System.out.println("외부 클래스의 지역변수 age: " + age);
			}
		}
		new InnerLocal().innerDoIt(); //그리고 내부에서 innerlocal 객체를 만들어 innerdoit을 실행.
		
	}
		
}
