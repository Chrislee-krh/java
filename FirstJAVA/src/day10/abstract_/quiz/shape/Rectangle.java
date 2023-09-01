package day10.abstract_.quiz.shape;

public class Rectangle extends Shape {

	double result;	
	
	@Override
	public double getArea() {
		result = (double)x * y; 
		return result;
	}
	
	Rectangle(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	
}
