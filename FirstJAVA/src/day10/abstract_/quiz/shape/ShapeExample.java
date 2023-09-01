package day10.abstract_.quiz.shape;

public class ShapeExample {

	public static void main(String[] args) {
		Triangle tri = new Triangle(4,5);
		Rectangle rec = new Rectangle(4,5);
		
		tri.showPosition();
		rec.showPosition();
		System.out.println(tri.getArea());
		System.out.println(rec.getArea());
		
	}

}
