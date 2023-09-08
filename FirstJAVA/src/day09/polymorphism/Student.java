package day09.polymorphism;

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
	
	

	public void study() {
		System.out.println(name + "학생은 공부중");
	}
	
//	@Override
//	public void study() {
//		System.out.println(name + "스튜던트 출력");
//		super.study();
//	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [name="+name+", age="+age+", 학번: "+studentId+", 전공= "+major+"]";
	}
	
}
