
public class MemberVariableExample {

	//멤버 변수란 클래스 내에서 사용하는 변수(인스턴스 변수-클래스가 만들어져야만 하는 변수)
	int a; 			//멤버 변수(인스턴스 변수, 속성, 필드)
	static int b;	//멤버 변수(클래스 변수)
	
	public static void main(String[] args) {
		//멤버 변수는 사용하기 전에 초기화 하지 않아도 기본 값으로 초기화가 된다.
		//System.out.println(a); //메인에 static이 붙어있어서, a는 읽어낼 수 없다.
		System.out.println("b의 초기값: " + b); 
		new MemberVariableExample().test();
	}

	public void test() {
		System.out.println("a의 초기값: " + a); //메서드에 static이 없기 때문에, a가 읽혀진다.
		System.out.println(b); //static으로 선언된 변수는 어디서든 가능.
	}
	
}
