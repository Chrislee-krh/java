package day05.quiz;

import java.util.Scanner;

public class CoffeShopDiscount {

	public static void main(String[] args) {
		// 2. 커피의 가격은 2000원, 10개 이상 구매하면 초과 분에 대한 커피는 1500원
		//		커피의 개수를 입력받고, 총 가격이 얼마인지 계산 후 출력하는 프로그램 만들기 
		
		//정답 1 if
		
		System.out.println("커피 값 계산 프로그램");
		System.out.print("> ");
		Scanner scan = new Scanner(System.in);
		int qty = scan.nextInt(); // 몇잔?
		int price = 0;
		int usual_price = 2000;
		int discount_price = 1500;
//		if (qty > 10) {
//			price += (10 * usual_price) + (qty - 10) * discount_price;
//		} else {
//			price += qty * usual_price;
//		}
//		
//		System.out.println("커피 가격은 " + price + "입니다.");
		
		//정답2 switch
		
		switch (qty/10) {
		case 0:		// 10잔 미만
			price += qty * usual_price;
			break;
		default:	// 10잔 이상인 경우
			price += (10 * usual_price) + (qty - 10) * discount_price;
			break;
		}
		System.out.println("커피 가격은 " + price + "입니다.");
		
		
		// 내답
//		Scanner scan = new Scanner(System.in);
//		
//		int price = 0;
//		int sum = 0;
//		int sum1 = 0;
//		int sum2 = 0;
//		
//		System.out.print("원하는 커피의 잔 수를 입력하세요: ");
//		int qnt = scan.nextInt();
//		for (int i= 1; i<10 ; i++) {
//			price = 2000;
//			sum1 += price;
//			} 
//			for (int j = 10; j<=qnt; j++) {
//				price = 1500;
//				sum2 += price;
//			}
//		
//		sum = sum1 + sum2;
//		
//		System.out.println(qnt + "잔으로 " + sum + "입니다.");
//		
	}

}
