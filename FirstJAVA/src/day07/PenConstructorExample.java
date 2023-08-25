package day07;

public class PenConstructorExample {

	public static void main(String[] args) {
		// 생성자 테스트
		Pen redPen = new Pen("red");
		System.out.println("펜의 색은 " + redPen.color + "입니다.");
		
		Pen pen2 = new Pen("노랑", 1000);
		System.out.println("펜의 색은 " + pen2.color+"이고, \n"
				+ "가격은 "+pen2.price+"원 입니다.");
		
		day06.Pen yellowPen = new day06.Pen("yellow");
		System.out.println("펜의 색은 " + yellowPen.color + "입니다.");
		
		
		
	}

}
