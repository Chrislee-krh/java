package day03;

public class forExample {

	public static void main(String[] args) {
		// 반복문(Loop):for, while, do ~ while
		// for문: 횟차가 정해진 경우에 사용
		/*
		 * 		for(초기값; condition; 증감){
		 * 			조건이 참인 경우 반복할 문장
		 * 		}
		 * 
		 */
		// 기본형태
		// 초기값은 for문에서 사용할 변수의 초기값을 의미한다.
		for (int i = 0; i < 10; i++) {
			System.out.println("i의 값: " + i);
		}
		// 초기값과 증감의 위치는 변경이 가능(단, 가독성이 떨어짐)
		int i = 0;
		for (;i < 10;) {
			//증감은 반복문 내에서 발생해야만 한다.
			System.out.println("i의 값: " + i++);
		}
		
	}

}
