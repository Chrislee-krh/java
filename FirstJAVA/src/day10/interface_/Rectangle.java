package day10.interface_;

public class Rectangle implements Shape {

	int width;
	int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * height;
	}

}
