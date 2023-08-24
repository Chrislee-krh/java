package day04.dailyQuiz;

import java.util.Random;

public class LotteryExample2 {
    public static void main(String[] args) {
    	// 3. 로또 번호 추출하기
    			//   앞서 배운 난수를 활용하여, 중복되는 번호 없이 1 ~ 45까지의 숫자 중
    			//   6개의 숫자를 랜덤추출하고, 콘솔에 출력하세요. 
    			//   (while문에 for)
    			System.out.println("======= 로또 추출 =======");
    			int[] lotto = {0,0,0,0,0,0};
    			
    			int index = 0;
    			while(true) {
    				// 랜덤값 생성
    				int rand = (int)(Math.random() * 45) + 1;  //1 ~ 45
    				int i = 0;  // index와 비교하기 위해서
    				for (i=0; i<index;i++) {
    					if(rand == lotto[i]) {  //추첨된 번호가 중복됨
    						break;
    					}
    				}
    				if(index == i) {  // 추첨된 번호에 있지 않음
    					lotto[index++] = rand;
    				}
    				if(index > 5) break; // 6개 번호 추첨 끝
    			}
    			
    			//결과 출력
    			for(int i=0; i<lotto.length; i++) {
    				System.out.print(lotto[i] + "\t");
    			}

    		}

    	}
