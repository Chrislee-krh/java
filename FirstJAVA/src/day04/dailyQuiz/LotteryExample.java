package day04.dailyQuiz;

import java.util.Random;

public class LotteryExample {

	public static void main(String[] args) {
		// 3. 로또 번호 추출하기
		// 앞서 배운 난수를 활용하여, 중복되는 번호없이 1 ~ 45까지의 숫자 중 6개의 숫자를 랜덤 추출하고 console에 출력. - 중복 검증
		// (while문에 for) - for만 쓰면 중복될 수 있음.
		
		int exstNum = 0;
				
		Random rand = new Random();
		
		while(true) {
			String str;
			int num;
			int cnt = 0;
			
			for(cnt = 1; cnt<=6; cnt++) {
				num = rand.nextInt(45)+1;
				
				if(exstNum != num) {
					exstNum = num;

					System.out.print(num + "\t");
					
					str = String.valueOf(exstNum);
					if (str.length()==6) {
						break;
					}
				
				}
			
			}
			System.out.println();
			
		}
		
	}
}

