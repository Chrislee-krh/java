package day04.dailyQuiz;

import java.util.Random;

public class LotteryExample2 {

	public static void main(String[] args) {
		// 3. 로또 번호 추출하기
		// 앞서 배운 난수를 활용하여, 중복되는 번호없이 1 ~ 45까지의 숫자 중 6개의 숫자를 랜덤 추출하고 console에 출력. - 중복 검증
		// (while문에 for) - for만 쓰면 중복될 수 있음.
		
		//처음 00은 스킵
		//for에서 돌고나서 index가 올라가서 i<index를 충족하면 i는 0으로 시작하니, index의 숫자 번 만큼(앞에 출력돼서 저장된 숫자 들의 수), 비교를 실행한다.
		//바로 아래 if에서는 i와 인덱스가 같은 상황이 아닌(숫자가 중복인 경우) 상황에만, 생성된 숫자가 lotto에 지정된 위치에 숫자가 들어간다.
		//그 아래 if는 6개의 숫자가 되기 전까진 계속 돌아가게 하는 if.
		
		System.out.println("========== 로또 번호 추출 ===========");
		int[] lotto = {0,0,0,0,0,0};
		
		int index = 0;
		
		while(true) {
			// 랜덤 값 생성
			int rand = (int)(Math.random() *45) + 1; // 1부터 45의 숫자 생성
			int i = 0; // 밖으로 뺀 이유: index와 비교하기 위해서..i가 카운트 할 때 마다 올라가서 더해짐.
			
			for(i=0; i<index; i++) {
				if(rand == lotto[i]) { // 이미 추첨된 번호(중복을 막기 위해)
					break; //break가 걸리면 i가 올라가지않고, break안걸리면 i가 올라간다
				}
			}
			if(index == i) { // 추첨된 번호에 있지 않음
				lotto[index++] = rand; //로또의 0번째 자리에 rand로 생성된 숫자가 처음 들어감, index가 실행될 때마다, 1씩 올라간다.
			}
			if(index >5) break; // 6개 번호 추첨 끝
		}
		
		//결과 출력
		for (int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + "\t");
		}
				
//		Random rand = new Random();
//		int[] exstNum = new int[6];
//
//		int cnt = 0;
//		
//		while(cnt<6) {
////			String str;
//			int num = rand.nextInt(45)+1;
//			int numCnt = 6;
//			
//			for(int j = 0; j<numCnt; j++) {
//				if(exstNum[j] != num) {
//					exstNum[j] = num;
//					System.out.print(num + "\t");
//					numCnt++;
//				} else {
//					continue;
//				}
//			}
//			cnt++;		
//		}
//

					
//					str = String.valueOf(exstNum);
//					if (str.length()==6) {
//						break;
					
	}

}