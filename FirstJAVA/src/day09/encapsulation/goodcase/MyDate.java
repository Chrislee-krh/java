package day09.encapsulation.goodcase;

public class MyDate {
	
	private int day;
	private int month;
	private int year;
	
	//getter
	public int getDay() {
		return day;
	}
	//setter: 입력값 검증
	public void setDay(int day) {
//		if (day>=1 && day<=30) this.day = day;
//		else System.out.println("잘못된 날짜입니다."); day = 1;
//		(day>=1) && (day<30) ? System.out.println(day) : (day = 1);   이렇게 되면 메서드의 사용방식이 잘못됐다고 뜬다.
		day = (day >= 1 && day <= 30) ? day : 1; //이렇게 해야함. 
		this.day = day;
	}
	
	
	
}
