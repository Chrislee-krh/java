package day06;

public class Pen {
	// 클래스 안에 코드를 작성
	// attribute(속성 - 멤버변수), constructors(생성자), method(메서드)
	
	// 멤버변수
	public String color; 	//패키지 무관 불러올 수 있다. -public
	int price;				//같은 패키지 내에서만 불러올 수 있다. -default
	
	public void write() {
		System.out.println("Hello World!");
	}
	
	public Pen(String color) {
		
		this.color = color;
	}	
}
