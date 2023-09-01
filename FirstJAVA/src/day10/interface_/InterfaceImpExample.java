package day10.interface_;

/*
 *  인터페이스 정리
 *	- 단일 상속 문제점을 해결
 *	- 인터페이스 메서드는 추상 메서드이어야 한다.
 *	- 인터페이스의 변수는 자동으로 상수가 된다.
 *	- 인터페이스를 구현할 때는 implements
 *	- 여러개 implements할 수 있다.(구현)
 *	- 다른 인터페이스 여러개를 extends할 수 있다.(상속)
 *	*** 기능의 명세를 위해 사용한다. ***
 */

public class InterfaceImpExample {

	public static void main(String[] args) {
		ToDo todo = new ToDo();
		IToDo3 itodo3 = todo; // 다형성 적용. ToDo가 앞의 todo다 받아 온 놈
		itodo3.m1();
		itodo3.m2();
		itodo3.m3();
//		itodo3.m4(); //Error - IToDo3는 m4가 없다. todo는 자식이니까 얘한테만 있는 거지, 부모는 쓸 수 없다.
		IToDo4 itodo4 = todo;
		itodo4.m4();
		
	}

}
