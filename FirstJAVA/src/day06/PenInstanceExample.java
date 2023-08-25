package day06;

public class PenInstanceExample {

	public static void main(String[] args) {
		// 생성된 Pen클래스의 객체 생성
		
		// 객체 생성 명령
		// ClassName instanceName = new Constructor()
		Pen redPen = new Pen("red");
		redPen.color = "red"; //색상 집어넣기
		System.out.println(redPen);
		System.out.println(redPen.color);
		//쓰기
		redPen.write();
		
	}

}
