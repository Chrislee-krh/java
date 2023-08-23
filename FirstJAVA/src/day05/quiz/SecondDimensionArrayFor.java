package day05.quiz;

public class SecondDimensionArrayFor {

	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 4, 5 };
		int[][] arr2 = {
				{3,3,3},
				{4,4,4},
				{5,5,5},
				number //1차원 배열
		};
		
		int num = arr2.length;
		int num2 = number.length;
		
		for(int i = 0; i<arr2.length; i++) {
			for(int j =0; j<arr2[i].length;j++) {
				System.out.println(arr2[i][j]);
			}
		}

	}

}
