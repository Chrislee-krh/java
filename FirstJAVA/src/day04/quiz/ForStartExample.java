package day04.quiz;

public class ForStartExample {

	public static void main(String[] args) {
		/*
		 *  상위 for문, 하위 for문이 뭔지를 기준점을 잡아 생각하도록 하자.
		 */
		int row = 5;
//		for (int i = 0; i <row; i++) {
//			for (int j = 0; j < i+1; j++ ) {
//				System.out.print("*");
//			}
//			System.out.println(); //줄바꿈
//		}
		
		//별 1 연습중
//		for (int i = 0; i < row; i++) {  //01234
//			for (int j = 5; (j <= 5-i && j>=0); j-- )  // 
//				System.out.print("*");
//				System.out.println();
//		}
		
		//별1 정답
//		for (int i = 0; i < row; i++) { 		// 0 1 2 3 4
//			for (int j = 0; j < row-i; j++ ) { 	// 5 4 3 2 1
//				System.out.print("*");
//			}
//			//for (int j = row; j > 0; j--)
//		System.out.println();
//		}
		
		//별2 연습중
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < row-i; j++ ) {
//			
//			}
//		}
		
		//별2 정답
//		for (int i = 0; i < row; i++) {
//			// 공백 찍기
//			for (int j = 0; j < row - i -1; j++) { 	//시작 값이 4. 4,3,2,1
//				System.out.print(" ");
//			}
//			for (int j =0; j < i + 1; j++) { 		//한 번씩 반복된 상태라서. i+1 => 1,2,3,4,5
//				System.out.print("*");
//		}
//		System.out.println();
//		}
		
		//별3 연습
//		for (int i = 0; i<row; i++ ) {
//			for (int j = 5; j >= i+1; j--) { //5 4 3 2 1, 
//				System.out.print("*");}
//			for (int j = 0; j<i+1; j++ ) {
//				System.out.print(" ");
//			}
//			System.out.println();
//			}
//		
		
		//별3 정답
		for (int i=0; i < row; i++) { //01234
			for(int j=0; j<i; j++) { // i=0
				System.out.print(" ");
			}
			for(int j = 0; j < row-i; j++) { //54321 dan-i
				System.out.print("*");
			}
			System.out.println();
		
		
		
		}
	}
}