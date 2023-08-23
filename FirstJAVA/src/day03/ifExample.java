package day03;

import java.util.Scanner;

public class ifExample {

	public static void main(String[] args) {
		// 단순 if 구문
		
		// if(조건식) {여러 개의 실행문} or 실행문
		// if문은 조건식이 true인 경우에 실행문이 동작합니다.
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력>> ");
		int num = scan.nextInt();
		
		if(num >= 10) System.out.println("입력한 정수는 10보다 크거나 같습니다."); // 더 작은 숫자가 들어가면, 조건문만 실행하고, 실행문은 실행하지 않은 것이다.
		if(num < 0) {
			System.out.println("입력한 정수" + num + "는 음수입니다." );
		}
		System.out.println("프로그램 종료!");
		
		scan.close(); // 힙으로 들어가게 되면 메모리 공간을 계속 사용하게 되는 거라 효율이 떨어진다. 
		//- 가비지 컬렉터가 메모리 릭이 발생하지 않게 내용을 정리하는데, 가비지 컬렉터는 이클립스 등의 프로그램을 종료할 때 정리하는 것으로, 프로그램 실행 중에는 정리되지 않는다.
	}

}
