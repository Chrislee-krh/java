package day09.static_;

public class Count {
	public int a = 0;
	public static int b = 0;
	
	public static int doIt() {
//		return ++a; // 논스태틱인 a로는 스태틱 참조를 쓸 수 없다. static메서드는 인스턴스 변수(a)를 객체 생성없이 참조 불가능
		++new Count().a; // 객체 생성해서 a를 써라. new Count()하고 a에 대하여 ++를 하겠다.
//		return ++new Count().a;
		return ++b;
	}
	
}
