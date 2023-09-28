package day07;

public class Pen {
	
	
	public String color;
	public int length;
	int price;

	
	/*
	 *	**  생성자는 반드시 클래스 안에 하나 이상 선언해야한다.
	 *		만약 선언하지 않으면, JVM(JAVA Virtual Machine)이 대신해서 기본 생성자를 자동으로 만든다.
	 *	**	기본 생성자는 매개변수를 가지지 않은 형태로, 자동으로 만들어지는 경우, 내용은 없음.
	 *	**	생성자 만드는 규칙	****************************
	 *		1. 생성자 이름은 클래스 이름과 대소문자까지 정확히 같아야 한다.   <- 조금이라도 달라지면 메서드 취급.(void같은 게 있고 없고 차이)
	 *		2. 생성자는 메서드와 달리 반환유형을 적지 않는다.
	 *		3. 생성자는 다른 유형으로 여러개 생성 가능 (생성자 오버로딩)
	 */
	
	public Pen() {
		color = "black";
	}

	public Pen(String color) {
		
		this.color = color;
	}

	public Pen(String color, int price) {
		
		this.color = color;
		this.price = price;
	}
	
	
	public Pen(String color, int length, int price) {
		this.color = color;
		this.length = length;
		this.price = price;
	}

	public void write() {
		System.out.println("Hello World!");
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	
	
}