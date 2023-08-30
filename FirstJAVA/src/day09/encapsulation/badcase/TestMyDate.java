package day09.encapsulation.badcase;

public class TestMyDate {

	public static void main(String[] args) {
		MyDate myBDay = new MyDate();
		myBDay.day = 32;
		System.out.println("My birthday is " + myBDay.day);

	}

}
