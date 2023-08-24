package day05.quiz;

public class ThirdDimensionArrayFor {

	public static void main(String[] args) {
		int[][] numArr = {
				{5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20},
				{30,30,30}
		};
		
		//정
		//답
		
//		int sum = 0;
//		int items = 0;
//		for(int i =0; i<numArr.length;i++) {
//			items += numArr[i].length;
//			for(int j=0; j<numArr[i].length;j++) {
//			sum+=numArr[i][j];
//			}
//		}
//		
//		System.out.println("총 합: " + sum);
//		System.out.println("평 균: " + sum/(double)items);
//		
		//내답
		int sum = 0;
		int items = 0;
		for(int i = 0; i<numArr.length; i++) {
			items += numArr[i].length;
			for(int j = 0; i<numArr[i].length; j++) {
					sum += numArr[i][j];
					double avg = (double)sum/items;
					System.out.println("총 합은: " + sum);
					System.out.println("평균값은: " + avg);
					
				}
			}
		}
		
		
	}


