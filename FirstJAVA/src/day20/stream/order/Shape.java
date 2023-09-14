package day20.stream.order;

public abstract class Shape implements Comparable<Shape>{
	
	// 필드
	int x,y;
	
	// 생성자
	public Shape() {}

	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 추상메서드
	public abstract double area();
	public abstract double length();
	
	// 일반메서드
	public String getLocation() {
		return "x: " + x + ", y : " + y;
	}

	@Override
	public int compareTo(Shape o) {
		return (int)(this.area() - o.area()); // 0 이면 같다, -1이면 그대로, 1이면 바꾼다 등의 비교를 위해 int 형변환
	}
}
