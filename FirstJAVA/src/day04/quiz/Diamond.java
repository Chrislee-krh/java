package day04.quiz;

public class Diamond {

	public static void main(String[] args) {
		// 피라미드 찍기, 단이 늘어날 때 마다 별이 2개씩 늘어난다.
		// 피라미드
		int row = 5;
		for(int i = 0; i <row; i++) {
			for (int j = 0; j < row -i -1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//역피라미드
		for(int i = 0; i < row; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			//별
			for(int j=0;j<2*row-(2*i)-1; j++) { //97531
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
