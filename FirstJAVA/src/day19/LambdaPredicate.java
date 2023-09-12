package day19;

import java.util.function.Predicate;

public class LambdaPredicate {
	
	static Student[] list = {
			new Student("홍길동", 90, 80, "컴공"),
			new Student("이순신", 95, 70, "통계"),
			new Student("이장춘", 100, 100, "컴공")
	};
	
	public static void main(String[] args) {
		// Predicate: 매개변수 있고, 리턴 타입 boolean
		// major computer science 학생 영어 점수 평균
		
		double avg = avgEng(t -> t.getMajor().equals("컴공"));
		System.out.println("컴공과 평균 영어점수: " + avg);
		
		double avg2 = avgMath(t -> t.getMajor().contentEquals("컴공"));
		System.out.println("컴공과 평균 수학점수: " + avg2);
		
	}

	private static double avgMath(Predicate<Student> predicate) {
		int count = 0;
		int sum = 0;
		for(Student s : list) {
			if(predicate.test(s)) {
				count++;
				sum+=s.getMath();
			}
		}
		return (double) sum/count;
	}
	
	private static double avgEng(Predicate<Student> predicate) {
		int count = 0;
		int sum = 0;
		for(Student student : list) {
			// equals 비교
			if(predicate.test(student)) {
				count++;
				sum += student.getEng();
			}
		}
		return (double)sum/count;
		
	}
	
}
