package day05.quiz;

import java.util.Scanner;

public class ConvertCapLower {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.println("> ");
		char ch = scan.nextLine().charAt(0); //charAt(0)
		
		if(ch >= 'A' && ch <='Z') {
			ch = (char)(ch - 'A' + 'a');
		} else if(ch>='a' && ch<='z') {
			ch = (char)(ch - 'a' + 'A');
		}
		
		System.out.println(ch);


		// String.toUpperCase(): 문자열을 대문자 문자열로 바꾼다.
		// String.toLowerCase(): 문자열을 소문자 문자열로 변경.
		System.out.println("Hello, world!".toUpperCase()); // HELLO, WORLD!
		System.out.println("Hello, world!".toLowerCase()); // hello, world!
		
	}

}
