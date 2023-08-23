package day05;

public class VariableLifetime {
	
	static int c;
	int b = 8; 	// 멤버 변수(instance 변수) **static이 붙으면 클래스 변수라 부른다. 
				//	1. 객체를 생성해야만 만들어서 int b를 쓸 수 있다. 2.(다음에) 선언할 때 static이 아니면, static 내부에선 쓸 수 없다.
		
	public static void main(String[] args) {
		// 변수의 수명
		
		// {}블럭 내부에서 선언된 변수는 지역 변수로{}을 벗어나면 사라진다.
		// 변수가 살아있는 범위를 변수의 영역(scope)이라고 부른다.
		//  변수의 영역만 겹치지 않는다면 같은 이름의 변수를 사용할 수 있다.
		// b = 5; 인스턴스라서 syntax에러로 안된다.
		
		int b = 5;
		System.out.println("main method의 b: " + b);
		int c = 10;
		c = 10; // static이면 쓸 수 있다.????????????????
		
		VariableLifetime obj = new VariableLifetime(); // 클래스 이름을 받아, 그 객체를 생성해서 obj에 넣었기 때문에 obj.b는 8이다.
		System.out.println("class의 b: " + obj.b);
		
		if(true) {
			// int b = 10; 이렇게 하면 중복되어 사용할 수 없다. b = 10; 이렇게 하면 재정의된다. 
			// 위의 class, main의 케이스와는 다르다. 
			// 다른 이유는..
			// 클래스에서 생성된 애는 위의 1,2를 참고해라!
		
			int a = 10; // 지역 변수
			System.out.println(a);
			a = 7;
		}
		
		//a=7; 찾을 수 없다고 뜬다.
		
		for (int i = 0; i<10; i++) {} // 내부의 i는 for문을 법어날 수 없다.
			int i = 10;
	}
}


