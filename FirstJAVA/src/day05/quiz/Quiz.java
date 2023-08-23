package day05.quiz;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// 1. 대문자 입력은 소문자 출력, 소문자 입력은 대문자 출력하기
		// 2. 커피의 가격은 2000원, 10개 이상 구매하면 초과 분에 대한 커피는 1500원
		//		커피의 개수를 입력받고, 총 가격이 얼마인지 계산 후 출력하는 프로그램 만들기 
		// 3. 랜덤으로 알파벳 대문자 50개 생성하여 출력하는 프로그램을 만들어보세요.
		//		출력은 열 글자마다 줄 바꿈해서 출력되게 해 주세요.
		//		e.g.) 	DEFDEGSDFE
		//				SDFEKSKKDK
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요> ");
		String str = scan.next();
		
		String pstr = "";
		
		for (int i = 0; i<str.length(); i++) {
			char uniInt = str.charAt(i);
			if('A'<uniInt&&uniInt<'Z') {
				pstr += (char)(uniInt + 32);
			} else if('a'<uniInt&&uniInt<'z') {
				pstr += (char)(uniInt -32);
			}
		}
		System.out.println(pstr);
		

	}

}
