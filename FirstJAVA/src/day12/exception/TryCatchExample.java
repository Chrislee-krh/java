package day12.exception;

public class TryCatchExample {

	public static void main(String[] args) {
		
		int i = 0; 
		String[] greetings = {"안녕하세요.", "반갑습니다.", "또, 오세요"};
		
		while(i<4) {
			try {
				// 예외 발생 가능 코드
				System.out.println(greetings[i]);
			} catch (ArrayIndexOutOfBoundsException e) { // 예외 정의
				// 예외 처리 코드 부분
				System.out.println("예외 발생!!.");
				System.out.println("예외 발생 원인: " + e.getMessage());
				System.out.println("예외 처리 완료!");
			} finally {
				// 항상 실행하는 부분
				System.out.println("finally문은 항상 실행된다.");
			}
			i++;	// 반복문의 제어(증감을 통한)
			
		}	// while문 끝
		System.out.println("메인의 마지막");
	}

}
