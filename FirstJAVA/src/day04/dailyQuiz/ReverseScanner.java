package day04.dailyQuiz;

import java.util.Scanner;

public class ReverseScanner {

	public static void main(String[] args) {
		// 2. 단어 거꾸로 출력하기(reverse 출력)
		// 자바의 Scanner 객체를 이용하여, console에 데이터를 입력
		// 입력된 데이터를 for문을 사용하여 거꾸로 출력하세요.
		// String.charAt(index)를 사용
		

		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요> ");
		String s = scan.next();
				
		for(int i = 0; i<s.length()-1; i++) {
			for (int j = s.length()-1; j>=0; j--) {
			System.out.print(s.charAt(j));
			
			}
			break;
		}

	}
	
}
