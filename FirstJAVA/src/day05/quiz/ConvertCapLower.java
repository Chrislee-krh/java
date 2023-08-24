package day05.quiz;

import java.util.Scanner;

public class ConvertCapLower {

	public static void main(String[] args) {
		
// 내답
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
		
//// 쌤답		
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("> ");
//		char ch = scan.nextLine().charAt(0); //charAt(0)
//		
//		if(ch >= 'A' && ch <='Z') {
//			ch = (char)(ch - 'A' + 'a');
//		} else if(ch>='a' && ch<='z') {
//			ch = (char)(ch - 'a' + 'A');
//		}
//		
//		System.out.println(ch);


		// String.toUpperCase(): 문자열을 대문자 문자열로 바꾼다.
		// String.toLowerCase(): 문자열을 소문자 문자열로 변경.
//		System.out.println("Hello, world!".toUpperCase()); // HELLO, WORLD!
//		System.out.println("Hello, world!".toLowerCase()); // hello, world!
		
	}

}
