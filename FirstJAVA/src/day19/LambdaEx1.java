package day19;

public class LambdaEx1 {

	public static void main(String[] args) {
		// 람다식 표현
		InterfaceEx ie = (int x, int y) -> x+y;
		// 기본 자바 표현
		InterfaceEx ie2 = new InterfaceEx() {  // 익명 클래스(내부 클래스 할 때)

			@Override
			public int sum(int x, int y) {
				// TODO Auto-generated method stub
				return x+y;
			}
		};
		System.out.println(ie.sum(1, 2));
		System.out.println(ie2.sum(1, 2));
	}
}

// 함수적 인터페이스: 추상 메서드 한 개를 가지고 있는 인터페이스
interface InterfaceEx {
	public int sum(int x, int y);
}