package day05.quiz;

import java.util.Scanner;

public class CoffeShopDiscount {

	public static void main(String[] args) {
		// 2. 커피의 가격은 2000원, 10개 이상 구매하면 초과 분에 대한 커피는 1500원
		//		커피의 개수를 입력받고, 총 가격이 얼마인지 계산 후 출력하는 프로그램 만들기 
		
		Scanner scan = new Scanner(System.in);
		
		int price = 0;
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		
		System.out.print("원하는 커피의 잔 수를 입력하세요: ");
		int qnt = scan.nextInt();
		for (int i= 0; i<qnt; i++) {
			if (qnt < 10) {
				price = 2000;
				sum1 += price;
			} else if (qnt>=10) {
				price = 1500;
				sum2 += price;
			}
		}
		sum = sum1 + sum2;
		
		System.out.println(qnt + " 잔으로 " + sum + "입니다.");
		
	}

}
