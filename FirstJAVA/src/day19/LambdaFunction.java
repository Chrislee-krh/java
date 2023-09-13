package day19;

import java.util.function.ToDoubleFunction;

public class LambdaFunction {

	static Student[] list = {
			new Student("홍길동", 90, 80, "컴공"),
			new Student("이순신", 95, 70, "통계")
	};
	
	public static void main(String[] args) {
		// Function<T, R>
		System.out.print("학생명: ");
		printString(t -> t.getName());
		
		System.out.print("전공: ");
		printString(t -> t.getMajor());
		
		System.out.print("영어 점수: ");
		printInt(t -> t.getEng()); // 재정의가 필요. int를 받는
		
		System.out.print("수학 점수: ");
		printInt(t -> t.getMath());	
		
		System.out.println("영어 점수 합계: ");
		printTot(t -> t.getEng());
		
		System.out.println("영어 점수 평균: ");
		printAvg(t -> t.getEng());
		
	}
	
	static void printAvg(ToDoubleFunction<Student> f) {
		double sum = 0;
		for(Student s : list) {
			sum += f.applyAsDouble(s);
		}
		System.out.println(sum/list.length);
	}
	
	static void printTot(java.util.function.Function<Student, Integer> f) {
		int sum = 0;
		for(Student s : list) {
			sum += f.apply(s);
		}
		System.out.println(sum);
	}
	
//	static void printTot(ToIntFunction<Student> f) {
//		int sum = 0;
//		for(Student s : list) {
//			sum += f.applyAsInt(s);
//		}
//		System.out.println(sum);
//	}
	
	
	static void printInt(java.util.function.Function<Student, Integer> f) {
		for(Student s : list) {
			System.out.print(f.apply(s) + " ");
		}
		System.out.println();
	}
	static void printString(java.util.function.Function<Student, String> f) {
		for(Student s : list) {
			System.out.print(f.apply(s) + " ");
		}
		System.out.println();
	}
	
}

class Student {
	private String name;
	private int eng;
	private int math;
	private String major;
	public Student(String name, int eng, int math, String major) {
		super();
		this.name = name;
		this.eng = eng;
		this.math = math;
		this.major = major;
	}
	public String getName() {
		return name;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public String getMajor() {
		return major;
	}
}