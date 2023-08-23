package day03;

public class SwitchExample {

	public static void main(String[] args) {
		// switch(수식) ~ case 구문
		int score = (int)(Math.random() * 100);
		System.out.println("점수: " +  score);
		
		//switch
		switch (score/10) {
		case 9:
			System.out.println("당신의 학점은 A입니다.");
			break; // switch case구문에서 나가야함.
		case 8:
			System.out.println("당신의 학점은 B입니다.");

		case 7:
			System.out.println("당신의 학점은 C입니다.");
			
		case 6:
			System.out.println("당신의 학점은 D입니다.");
					
		default:
			System.out.println("당신의 학점은 F입니다.");
			System.out.println("당신은 재수강 대상자 입니다.");
			break;
		}
	}

}
