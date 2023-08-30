package day08.inheritance.goodcase;

import day08.inheritance.Person;

public class Student extends Person {

	public String studentId;
	public String major;
	
	
	public Student() {
		// 기본 생성자, super(); 생략, 
	}
	
	public Student(String name, int age) {
		super(name, age);
	}
	
	public Student(String name, int age, String studentId, String major) {
		super(name, age);
		this.studentId = studentId;
		this.major = major;
	}
	
	public String getDetail() {
		return "이름: " + name + "\t나이: " + age + "\t학번: " + studentId + "\t전공: " + major;
	}
	
}
