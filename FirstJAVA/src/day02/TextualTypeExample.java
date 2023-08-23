package day02;

public class TextualTypeExample {

	public static void main(String[] args) {
		char one = 'A';
		char two = '\t'; //탭 간격을 나타내는 문자
		
		/*  이스케이프 문자
		 *  '\n' : 줄바꿈(New Line(\u000A))
		 *  '\t' : tab(8자리 띄우기(\u0009))
		 *  '\b' : backspace(커서 뒤로 보내기(\u0008))
		 *  '\r' : return(\u000D)
		 *  '\f' : form feed(\u000C)
		 *  '\\' : backslash삽입(\u005C)
		 *  '\'' : single quote(\u0027)
		 *  '\"' : double quote(\u0022)
		 */
		
		char three = '\uAC00'; //16진수 4자리 입력. 한글 '가'
		String four = "\uD604\uC218";
		String five = "dream";
		System.out.printf("%c, %c, %c, %s, %s", one,two,three,four,five);
		
		/*
		 * String 클래스를 이용한 변수 선언
		 * String s1 = "Hello"; //변수 선언 및 할당
		 * String s2 = new String("Hello"); //객체 생성
		 * String s3; // default값은 null
		 * String s4 = ""; //null String, 길이가 0. 위와 다른 점은 null을 직접 적용한 것
		 * String s5 = " "; //blank String, 길이가 1짜리 공백이 들어간 형태. null 아님.
		 * 
		 * 문자열과 다른 타입을 "+" 연산하게 되면 무조건 문자열로 변환된다.
		 * 	e.g.) 100 + 200 = 300, 100 + "200" = 100200, 10+20+"Hell0" -> 30Hello, "Hello" + 10 + 20 = Hello1020		 
		 */
		
		
		// char 문자형은 정수 0 ~ 65535의 범위 값을 가짐!
		char t1 = 'A' + 10;
		System.out.printf("\nt1에 A의 값: %c", t1); //K 65+10=75. 75자리는 K char이라 문자로 나타남.
		
		char t2 = 'A' + 'A';
		System.out.printf("\nt2에 A의 값: %c", t2); // 값이 표시되지 않음
		
		int t3 = 'A' + 'A';
		System.out.printf("\nt3에 A의 값: %d", t3); //130. int라 숫자로 나타남.
		
	}

}
