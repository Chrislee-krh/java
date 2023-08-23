package day03;

import java.util.Scanner;

// 패키지는 소문자로만 구성. 대/소문자로 패키지와 클래스를 쉽게 구분



public class IOExample {

	public static void main(String[] args) {
		// Scanner 클래스는 입력값을 처리하는 객체
		Scanner scan = new Scanner(System.in);
		
		// 사용자의 입력을 대기
		// System.out.print(">");
		// String line = scan.next(); // "단어" 입력 값의 공백(space, tab, enter) 전 까지만 처리
		// String line = scan.nextLine(); // "문장" 입력 값 중 enter("\n") 전 까지 입력 처리 - \n을 적는다고, 다음 문장으로 가지 않는다. 단순 문자열로 받아서 \n이 출력된다.
		// System.out.println("사용자가 입력한 문자열: " + line);
		
		// 참조 변수는 힙에 저장된다. 여기서 객체 정리하는 close() - 지우는 기능
		// 참조 타입 변수에 "."을 찍은 후 ctrl+space를 사용하여, 그 타입에 쓸 수 있는 기능(함수-메서드들)을 볼 수 있음.
//		System.out.print("has next boolean: ");
//		boolean b = scan.hasNextBoolean(); // 입력 값에 true/false가 있는 지 체크
//		System.out.println("boolean 포함 여부: " + b);
		
		// 사용자 입력 기다리고, 입력된 정수 값을 읽어들임.
		System.out.print("아무 정수 값이나 입력하세요>>>");
		int num = scan.nextInt(); // 정수를 읽어내는 법
		System.out.println("사용자가 입력한 정수: " + num);
		System.out.println("사용자가 입력한 정수가 만들 char: " + (char)num);//2바이트가 넘지않는 숫자를 넣어주면 된다.
		scan.close();
		
		
		
		
	}

}
