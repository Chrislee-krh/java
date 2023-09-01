package day10.abstract_.quiz.shape;

public abstract class Shape {

	protected int x;
	protected int y;
	
	public void showPosition() {
		System.out.println("X좌표: " +x+ ", Y좌표: " +y);
	}
	
	public abstract double getArea();
}
