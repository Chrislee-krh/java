package day05;

import java.util.Arrays;
import java.util.Random;
import java.util.Random;

public class ArrayQuiz {

	public static void main(String[] args) {
		// 1. 1000개의 int형 배열을 생성한 뒤, 모든 값을 1 - 100사이의 random숫자로 채워보세요.
		// 2.  그 채워진 1000개의 랜덤 숫자들 중 각 숫자가 몇 번씩 나왔는지 세어 출력하세요.
	
		int[] num = new int[1000];
		
		for (int i = 0; i< 1000; i++) {
			num[i] = (int)(Math.random() * 100) +1; 
		}
		System.out.println(Arrays.toString(num));
		System.out.println(num.length);
		
		// 2. 1000개에서 각 확인
		int[] cnt = new int[100];
		for(int j=1; j<=100; j++) { // 1-100의 나온 횟수
			for(int i = 0; i < num.length; i++) { // 전체 데이터에서 1-100사이 값찾기
				if(j==num[i]) { //num의 위치의 수가 j랑 같다면,
					cnt[j-1]++; // cnt의 숫자를 늘리는 것
				}
			}
		}
		int check = 0; //검증! 1000개가 나오는지를 체크하려고
		for (int i = 0; i < cnt.length; i++) {
			System.out.println(i+1 + "이 나온 횟수: " + cnt[i]);
			check += cnt[i];
		}
		System.out.println(check);
	}
}
//		int[] intArr = new int[1000];
//		int cnt = 0;
//		int index = 0;
//		Random rand = new Random();
//		
//		while(cnt<1000) {
//			int num = rand.nextInt(100)+1;
//			intArr[cnt] = num;
//			cnt++;
//			
//			int[] frequency = new int [101];
//			for (int num : array) {
//				frequency[num]++;
//				
//			}
//			if(intArr[cnt] == num) {
//				;
//			}
//		}
//		System.out.println(Arrays.toString(intArr));
//		
//	}
//
//}
