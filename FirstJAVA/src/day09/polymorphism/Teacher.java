package day09.polymorphism;

public class Teacher extends Person {
	
	public String teacherId;
	public String subject;
	
	public Teacher(){
	
	}
	
	public Teacher(String name, int age, String subject){
		super(name, age);
		this.subject = subject;
	}
	
	public String getDetail() {
		return  "이름: " + name + "\t나이: " + age + "\t교번: " + teacherId + "\t담당과목: " + subject;
	}
	
}
