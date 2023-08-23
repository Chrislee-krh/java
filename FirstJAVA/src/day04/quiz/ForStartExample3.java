package day04.quiz;

import java.util.Scanner;

public class ForStartExample3 {

	public static void main(String[] args) {
		
//		int row = 9;
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < row - i - 5; j++) { 
//				System.out.print(" ");
//			}
//			for (int j = 0; 2*i + 1 > j; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for (int i = 0; i < row -1; i++) {
//			for(int j = 0; j < i+1; j++) {
//				System.out.print(" ");
//			}
//			for(int j = 0; j < 2*(row-i-1)-1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	
//	}
//}

Scanner scan = new Scanner(System.in);

System.out.print("줄 수를 홀수로 입력하세요: ");
int row = scan.nextInt();
int sp = row/2;
int star = 1;
boolean flag = true;

for (int i = 0; i< row; i++) {
	for(int j =0; j< sp; j++) {
		System.out.print(" ");
	}
	for(int j =0; j <star; j++) {
		if(j ==0 || j == star-1) {
			System.out.print("*");
		} else {
			if(j%2 == 0) System.out.print("$");
			else System.out.print(" ");
	}
	}
	System.out.println();
	
	if(i==(row/2)) flag = false; // 반전을 위한 중간값 체크. flag기법으로, 자료를 빠르게 찾을 수 있다.
	if(flag) {
		sp -=1; star +=2;
	} else {
		sp +=1; star -=2;
	}
}
scan.close();
}
}
