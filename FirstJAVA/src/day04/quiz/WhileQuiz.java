package day04.quiz;

public class WhileQuiz {

	public static void main(String[] args) {
		// while문을 이용하여, 구구단을 다음과 같이 세로로 출력합니다.
		// 2단		3단		4단		...

		//연습
		System.out.println("구구단을 시작합니다.");
		
		
		int j = 1;
		int result = 0;
		
		while(j<=9) {
			
			int i = 2; // 다음 반복 시에 원래 2로 돌아와야 합니다.
			
			while(i<=9) {
				result = i*j;
				System.out.printf(i + "*" + j + "=" + result + "\t");
				i++;
			}
			System.out.println();
			j++;
		}
		
		//정답
//		int multP = 0;
//		
//		
//		while(multP<=9) {
//			int dan = 2;
//			while(dan <= 9) {
//				if(multP == 0) {
//					System.out.print(dan + "단\t"); 
//				} else {
//					System.out.printf("%dx*%d\t", dan, multP, dan * multP);
//				}
//				dan ++;
//			}
//			System.out.println();
//			multP++;
//		}
		
	}

}
