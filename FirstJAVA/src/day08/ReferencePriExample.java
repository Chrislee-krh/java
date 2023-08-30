package day08;

public class ReferencePriExample {

	public static void main(String[] args) {
		// String 문자열 비교하기
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println("str1과 str2의 비교 결과: " + (str1 ==str2));
		System.out.println(str1);
		
		// new를 사용한 객체 비교
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		System.out.println("str1과 str2의 비교 결과: " + (str3 == str4));	
		System.out.println("str1과 str2의 비교 결과: " + (str3.contentEquals(str4)));	
		String str5 = new String(str1);
		System.out.println("str5와 str1의 비교 결과: " + (str1 == str5));
		System.out.println("str5와 str1의 비교 결과: " + (str1.equals(str5)));	
		System.out.println(str3);
		
	}

}
