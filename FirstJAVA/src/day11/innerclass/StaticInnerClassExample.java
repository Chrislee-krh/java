package day11.innerclass;

public class StaticInnerClassExample {

	public static void main(String[] args) {
		// static 유무에 따른 접근 방식
		
		// static 있음
		University.Student us = new University.Student();
		// static 없음
//		Highschool.Student high = new Highschool.Student();
		Highschool high = new Highschool();
		Highschool.Student hs = high.new Student(); // 내부 객체 생성
		
	}

}
