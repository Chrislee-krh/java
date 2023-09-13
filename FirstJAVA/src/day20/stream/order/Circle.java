package day20.stream.order;

public class Circle extends Shape {
	// 필드
	double r;
	
	// 생성자
	public Circle() {
		this(1);
	}
	
	public Circle(int r) {
		this.r = r;
	}

	@Override
	double area() {
		return (r*r)*Math.PI;
	}

	@Override
	double length() {
		return (2*r)*Math.PI;
	}

	@Override
	public String toString() {
		return "넓이: " + this.area()+ "둘레: " + this.length();
	}

	
}
