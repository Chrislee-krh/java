package day04.dailyQuiz;

public class PrimeNumber {

	public static void main(String[] args) {
		// 소수 구하기
		// 연습
//		for (int i = 2; i <= 100; i++) {
//			cnt = 0;
//			for (int j = 1; j < i-1; j++) {
//				if(i%j ==0) {
//					cnt++;
//										
//				}
			
//			}
//		}
		// 정답 1.
		System.out.println("=====PrimeNumber=====");
		int cnt;
		for (int i = 2; i <= 100; i++) {
			cnt = 0; // 배수 여부 확인
			for (int j = 1; j <= i; j++) {
				if(i%j == 0) {
					cnt++;  // cnt라면 소수이다
				}
			}
			if(cnt ==2) {
				System.out.print(i+" ");
			}
		}
		
		
	}

}
