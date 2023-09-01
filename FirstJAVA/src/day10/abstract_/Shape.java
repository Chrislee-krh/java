package day10.abstract_;

public abstract class Shape { //추상 클래스. 객체를 만들 수 없다
	
	private int x;
	private int y;
	
	public Shape() {} // 기본 생성자
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract double getArea(); // 추상 메서드 구현되어 있지 않음. - 반드시 구현해야함
	
	public String position() {				// 추상 클래스는 일반 메서드를 사용할 수 있다.
		return "[x= " + x + ", y= "+y+"]";
	}
}
