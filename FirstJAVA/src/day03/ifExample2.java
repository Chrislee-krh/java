package day03;

import java.util.Random;

public class ifExample2 {

	public static void main(String[] args) {
		// 난수 생성: 임의 값(random) 
		// 1. Math.random() : 0 ~ 1미만의 임의의 값을 출력(double값)
		// 2. Random 모듈을 import한다: import 명령어는 라이브러리/클래스를 로드
		//    각 타입별로 난수를 발생시키는 메서드가 Random에 존재함.
		//    이때, 난수를 생성하기 위한 Seed를 지정할 수 있음.
		//    Seed가 동일하면 동일 난수가 발생함. 그래서 시간을 쓴다. - num타입으로 받음.
		//    ntp라는 타임서버에서 받아온다.(그래서, 동일 시간으로 컴퓨터가 동작한다. - 인터넷 연결시)
		//    Random 메서드
		//     - nextFloat() - 0.0이상 1.0미만의 float형 난수 발생
		//     - nextBoolean() - true/false 중 임의의 값
		//     - nextInt()- int형 타입 이내의 모든 값에서 난수 발생
		//     - nextInt(int) - 0부터 생성자에 들어간 숫자 -1까지 int형 난수 발생
//
//		Random rand = new Random(); // long seed를 넣으면 같은 값을 받는다.
//		float a = rand.nextFloat();
//		boolean b = rand.nextBoolean();
//		int c = rand.nextInt();
//		int d = rand.nextInt(10); // 0~9까지의 값
//		System.out.printf("%f, %b, %d, %d", a,b,c,d);
		
		//if ~ else 구문: if조건식 true면 if의 실행문, 그렇지 않으면 else의 실행문을 구동.
		//정수 난수 발생(0~99)
		int score = (int)(Math.random() * 100);
		
		System.out.println("점수: " + score);
		/*
		 * print(): 전달 값 출력
		 * printf(): 문자열의 포맷 문자로 결과 출력
		 * println(): 문자열 값 마지막에 \n 추가됨. 즐, 줄바꾼 처리.
		 */
		if(score>=60) {
			System.out.println("60점 이상인 점수 입니다");
			System.out.println("합격하셨습니다.");
		} else {
			System.out.println("60점보다 작은 점수 입니다");
			System.out.println("불합격하셨습니다.");
		
			
		}
		
	}

}
