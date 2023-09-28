package day09.polymorphism;

public class ObjectCollectionExample {

	public static void main(String[] args) {
		// Object 객체 배열 선언
		Object[] objArr = new Object[6];
		
		objArr[0] = new Person("홍길동", 30);
		objArr[1] = new Teacher("홍교수", 32, "자바");
		objArr[2] = new Student("홍학생", 25, "20230001", "Java");
		objArr[3] = new Integer(100);
		objArr[4] = new String("홍길동");
		objArr[5] = new java.util.Date();
		
		for(int i = 0; i<objArr.length; i++) {
			System.out.println(objArr[i]);
		}
		
	}

}
