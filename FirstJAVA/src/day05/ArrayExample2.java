package day05;

import java.util.Arrays;

public class ArrayExample2 {

	public static void main(String[] args) {
		// 다차원 배열
		// 1차원 배열 : int를 요소로 가지고 있는 배열
		int[] number = { 1, 2, 3, 4, 5 };
		
		// 배열의 요소는 length - 1 번 방(저장공간)까지 있음.
		System.out.println(number[number.length -1]);
		
		// 2차원 배열: int[]을 요소로 가지고 있는 배열, 1차원 배열(쭉 나열된 형태)을 가지고 있는 상태. "[1차원]-> 중괄호, [2차원]-> 내부의 각 요소"의 인덱스 값이 들어간다.
		// 이해하려면 2차원 배열은 {3,3,3}{4,4,4}{5,5,5} 얘들이 0,1,2 자리에 들어간 거라 생각하면 된다.
		// arr2[1][1] = 4;, arr2[2][2] = 5;, arr2[3][3] = 4; <- 여기서 4는 number안에 들어간 숫자
		int[][] arr2 = {
				{3,3,3},
				{4,4,4},
				{5,5,5},
				number //1차원 배열
		};
		
		System.out.println("1: " + arr2[1][2]); //4
		System.out.println("2: " + arr2[2][1]); //5
		System.out.println("3: " + arr2[3][arr2[3].length-1]);
		System.out.println("int[]의 갯수: " + arr2.length);
	
		// 3차원 배열: int[][]을 요소로 가지고 있는 배열
		// int[][][] arr3 = {arr2, arr2, arr2, arr2, arr2}
		int[][][] arr3 = new int[4][][]; // [4][][]; 면 2차배열의 개수가 4개라는 뜻이고, 뒷 내용을 모르면 저렇게만 작성해도 됨.
		arr3[0] = arr2;
		arr3[1] = arr2;
		arr3[2] = arr2;
		arr3[3] = arr2;
		
		// 4차원 배열: int[][][]을 요소로 가지는 배열
		int[][][][] arr4 = {arr3, arr3, arr3, arr3};
		
		// n차원 배열: 배열의 요소로 n-1차원배열을 가지는 배열.
		
		// n차원 배열의 모든 요소를 n중 반복문을 사용하여 탐색할 수 있음.
		
		for(int i = 0; i<arr2.length; i++) {
			for(int j =0; j<arr2[i].length;j++) {
				System.out.println(arr2[i][j]);
			}
			System.out.println();
		}
		
		//arr3의 요소 출력
		for(int i=0; i<arr3.length;i++) {
			for(int j=0; j<arr3[i].length;j++) {
				for(int k=0;k<arr3[i][j].length;k++) {
					System.out.println(arr3[i][j][k]);
				}
			}
			
		}
		
		
		
	}

}
