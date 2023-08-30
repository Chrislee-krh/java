package day09.encapsulation.goodcase;

public class TestMyDate {

	public static void main(String[] args) {
		MyDate myBDay = new MyDate();
//		myBDay.day = 32; // 접근 제한자: private
		myBDay.setDay(32);
		System.out.println("My birthday is " + myBDay.getDay());

	}

}
