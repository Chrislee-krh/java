package day08.inheritance;

import day08.inheritance.goodcase.Employee;
import day08.inheritance.goodcase.Student;
import day08.inheritance.goodcase.Teacher;

public class InheritanceExample {

	public static void main(String[] args) {
		
//		Person p = new Person();
//		p.name = "홍길동";
//		p.age = 25;
//		p.height = 179.8f; // protected
//		p.weight = 70f;    // default
		Person p = new Person("홍길동", 25, 179.8f);
		System.out.println(p.getDetail());
		
		Student s2 = new Student();
		System.out.println(s2.getDetail());
		
//		Student s = new Student();
//		s.name = "이순신";
//		s.age = 30;
		Student s = new Student("이순신", 30, "20230828", "해양학과");
		s.studentId = "20230828";
//		s.major = "해양학과";
		s.height = 186.8f; // protected
//		s.weight default였을 땐 같은 패키지가 아니라서 작동하지 않음.
		
		Teacher t = new Teacher();
		t.name = "강감찬";
		t.age = 40;
		t.subject = "자바 프로그래밍";
		t.teacherId = "202311011";
		System.out.println(t.getDetail());
		
		Employee e = new Employee();
		e.name = "김덕우";
		e.age = 45;
		e.companyId = "2021011200";
		e.department = "강사부";
		
	}

}
