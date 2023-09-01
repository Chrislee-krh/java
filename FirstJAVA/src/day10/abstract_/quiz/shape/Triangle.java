package day10.abstract_.quiz.shape;

public class Triangle extends Shape {
	
	private int z;
	double result;	
	
	@Override
	public double getArea() {
		return ((double)(x-z) * (y-z))/2; 
	}
	
	Triangle(int x, int y){
		this.x = x;
		this.y = y;
		z = 0;
	}
}
