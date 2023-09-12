package day19;

public class LambdaEx {

	public static void main(String[] args) {
		LambdaInterface li = () -> {
			String str = "메서드 출력";
			System.out.println(str);
		};	
		li.print();
	}
}

interface LambdaInterface {
	void print();
//	void print2(); // 함수적 인터페이스(추상메서드는 한 개)가 아니라서 람다식 -> 부분에 에러가 뜬다.
}