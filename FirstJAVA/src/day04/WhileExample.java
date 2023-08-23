package day04;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		// while 문
		// for문 보다 좀 더 자유도가 높은 반복문
		// why? for문은 (초기값; 조건; 증감값)
		// 하지만, while은 조건만으로 반복 처리!
		
		/*
		 * 		(형식 - syntax)
		 * 		while (condition) {
		 * 			조건이 참일 때, 실행할 문자!
		 * 		}
		 * 
		 */
		// 증가값 위치에 따라서 결과에 차이가 생김!
		int i = 0; //시작값
//		
//		while(i<10) { //조건
//			i++;	//증감값, 1부터 10까지 출력
//			System.out.println(i);
//			//i++; -> 0부터 9까지 출력
//		}
		
		// while의 무한 루프
//		while(true) {
//			System.out.println(i += 10000);
//			if(i%20000 == 0)
//				continue;
//			if(i < 0)
//				break;
//		}
//		
		// do ~ while 구문: 거의 안씀
		// 반복할 때에 무조건 한 번 이상 실행해야 하는 경우.
//		
		Scanner scan = new Scanner(System.in);
//		
		while((i= scan.nextInt()) != 0) {
			System.out.println("i가 0이 아닙니다.");
		}
//		do {
//			System.out.print("> ");
//			i = scan.nextInt();
//			System.out.println("i가 0 이어도 일단 한 번 실행합니다.");
//			
//		} while(i!=0);
		}
	}



