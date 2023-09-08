package day13.api.java_util;

import java.util.Arrays;

public class ArraysExample1 {

	static double arr;
	
	public static void main(String[] args) {
		// 배열의 복사
		double[] arrOrg = {1.1,2.2,3.3,4.4,5.5};
		
		// 배열 전체 복사
		double[] arrCpy1 = Arrays.copyOf(arrOrg,arrOrg.length);
		for(double d: arrCpy1) {
			System.out.println(d + "\t");
			System.out.println();
		
		// 처음부터 세번째 요소까지 복사
		double[] arrCpy2 = Arrays.copyOf(arrOrg, 3);
		
		// 1부터 3인덱스까지 복사
		double[] arrCpy3 = Arrays.copyOfRange(arrOrg, 1, 4);
		
//		for(int i = 0; i < arrCpy1.length; i++) {
//			arr += arrCpy1[i];
//			System.out.println(arr);

		
		}
		
	}

}
