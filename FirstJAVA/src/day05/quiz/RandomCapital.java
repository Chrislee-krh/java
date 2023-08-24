package day05.quiz;

public class RandomCapital {

	public static void main(String[] args) {
		// 3. 랜덤으로 알파벳 대문자 50개 생성하여 출력하는 프로그램을 만들어보세요.
		//		출력은 열 글자마다 줄 바꿈해서 출력되게 해 주세요.
		//		e.g.) 	DEFDEGSDFE
		//				SDFEKSKKDK
		
		int symbol_size = 'Z' - 'A' + 1; //26
		
		for (int i = 0; i < 50; i++) { //랜덤값 50개 만들기
			char ch = (char)(Math.random()*symbol_size + 'A');
			System.out.print(ch);
			if(i%10 == 9) {
				System.out.println();
			}
			
		}
		
		// 내 답
//		char[] str = new char[50];
//
//		int i;
//		
//		for (i = 0; i<str.length; i++) {
//			str[i] = (char)((Math.random()*26)+65);
//			System.out.print(str[i]);
//			
//			if ((i+1)%10 == 0) {
//				System.out.println();
//			}
//		}
	}

}
