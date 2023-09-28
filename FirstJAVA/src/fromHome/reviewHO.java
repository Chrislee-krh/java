package fromHome;

import java.util.Scanner;

public class reviewHO {

	public static void main(String[] args) {
//		2번
//		문자열 거꾸로 출력하기
		Scanner scan = new Scanner(System.in);
		String reverse = "";
		System.out.print("문자열을 입력하시오> ");
		String str = scan.next(); 
		for(int i = str.length()-1; i>=0; i--) {
			reverse += str.charAt(i);
		}
		System.out.println(reverse);
		
//		 1번
//		 1+(1+2)+(1+2+3)+---+(1+2+3+---+9) 를 출력하고 합까지 출력.
//		 정확한 답을 만들었다!
//		int sum = 0;
//		for(int i = 1; i<=10;i++) {
//			if (i!=1) System.out.print("(");
//			for(int j = 1; j<=i; j++) {
//				System.out.print(j);
//				if (i!=j) System.out.print("+");
//				
//				sum += j;
//			}
//			if (i!=1) System.out.print(")");
//			if(i!=10) System.out.print("+");
//		}
//		System.out.println("= " + sum);
		
		}

}
