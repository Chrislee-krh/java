package day03;

public class innerForExample {

	public static void main(String[] args) {
		// 이중(다중) for 구문
		for (int i = 0; i < 10; i++) {
			System.out.println("======================바깥쪽 반복문" + i);
			
			for (int j = 0; j < 10; j++) {
				System.out.println("----------------------안쪽 반복문" + i+ "-" +j);
				
				for (int k = 0; k < 2; k++) {
					System.out.println("+++ 제일 안쪽 반복문" + i +"-" + j + "-" +k);
				}
			}
			
		}
	}

}
