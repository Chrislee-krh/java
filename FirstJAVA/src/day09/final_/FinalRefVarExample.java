package day09.final_;

public class FinalRefVarExample {

	static final MyDate date = new MyDate();
	
	public static void main(String[] args) {
		
//		date = new MyDate(); // 객체 새로 만들기 불가, 내부의 값은 변경 가능
		date.year = 2024;
		System.out.println(date.toString());
		
	}

}

class MyDate {
	int year = 2023;
	int month = 1;
	int day = 1;
	
	public String toString() {
		return "["+year+"-"+month+"-"+day+"]";
	}
	
	public void doIt(final int a) {
//		a++; // final이라 바꿀 수 없다.
	}
	
}