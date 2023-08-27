package fromHome;

import java.util.Arrays;
import java.util.Scanner;

public class NextThree {
	
	
	
	public static void main(String[] args) {
//		19번
//		System.out.println(sum(5));
//		System.out.println(sum(6));
//	}
//	
//	static int sum(int n) {
//		int sum = 0;
//		for(int i=1; i<=n; i++) {
//			if (n%i == 0) sum += i; 
//			else continue;
//		}
//		return sum;
//	}
//	
//	
//		18번
//		String str = java(5);
//		System.out.println(str);
//	
//	}
	// 정답
//	static String java(int num) {
//		String result = "";
//		for (int i = 1; i <= num; i++) {
//			String str = (i%2 == 1) ? "자" : "바";
//			result += str;
//		}
//		return result;
//	}
	
	// 18번 내답. <-
//		String strArray[] = new String[num];
//		String a = "자";
//		String b = "바";
//		for (int i = 1; i<=num; i++) {
//			if (i%2 == 1) System.out.println(a);
//			else System.out.println(b);
//		}
//		return a+b;
//	}
	
	
		
//		17번	
//		method1();
//		method2("이장춘");
//		Double methSum = method3(3,4,5);
//		System.out.println(methSum);
//		System.out.println("method3(3,4,5)");
//		method3(3,4,5);
//		method4(3);
//		method5("가", 3);
//		double maxMax = maxNum(3,5);
//		System.out.println("더 큰 숫자는 " + maxMax);
//		absNum(-5);
//		method6(3);
//		int[]iArr = {3,4,5,6,7};
//		System.out.println(method7(iArr));
//	}
//	
//	static void method1() {
//		System.out.println("\"안녕\"");
//		}
//	static String method2(String str) {
//		System.out.println("전달 받은 매개 변수 리턴: " + str);
//		return str;
//	}
//	static double method3(int i, int j, double k) {
//		double sum = i + j + k;
//		return sum;
////		return i+j+k;
//	}
//	static String method4(int i) {
//		return (i%2 ==0)? "홀수": "짝수";
////		String str = null;
////		if(i%2 == 0) str = "짝수";
////		else str = "홀수";
////		return str;
//	}
//	static void method5(String str, int cnt) {
//		for(int i = 0; i<cnt; i++)
//		System.out.print(str + "\t");
//	}
//	static double maxNum(double i, double j) {
//		double num = Math.max(i, j);
//		return num;
//	}
//	static double absNum(double i) {
//		double num = Math.abs(i);
//		System.out.println("해당 숫자의 절대 값은 " + num);
//		return num;
//	}
//	static int method6(int num) {
//		int sum = 0;
//		for(int i = 1; i<=num; i++) {
//			sum += i;
//		}
//		System.out.println("해당 숫자까지의 합은: " + sum);
//		return sum;
//	}
//	static int method7(int[] intArray) {
//		return intArray.length;
////		int cnt = 0;
////		for(int i = 0; i<intArray.length; i++) {
////			cnt++;
////		}
////		System.out.println("입력한 숫자까지의 카운트 횟수는: " + cnt);
////		return cnt;
//	}
//	static String[] method8(String str1, String str2) {
//		String[] strArray = {str1, str2};
//		System.out.println("입력된 내용은 " + Arrays.toString(strArray));
//		return strArray; 
//	}
	
		
//		16-4
//		String[] kakaoFr = new String[] {"무지", "네오", "어피치", "라이언", "단무지"};
//		Scanner scan = new Scanner(System.in);
//		System.out.print("현재 저장된 친구들: ");
//		System.out.println(Arrays.toString(kakaoFr));
//		System.out.print("검색할 카카오친구> ");
//		String name = scan.next();
//		boolean bool = false;
//
//		for(int i = 0; i<kakaoFr.length; i++) {
//			if(name.equals(kakaoFr[i])) {
//				System.out.println(name + "친구는 " + (i+1) + "번째에 있습니다.");
//				bool = true;
//				break;
//			}
//
//		}
//		if(!bool) System.out.println(name + "친구는 없습니다!");
//
//		switch(name) {
//		case "무지":
//			System.out.println(kakaoFr[0]);
//			break;
//		
//		case "네오":
//			System.out.println(kakaoFr[1]);
//			break;
//			
//		case "어피치":
//			System.out.println(kakaoFr[2]);
//			break;
//		
//		case "라이언":
//			System.out.println(kakaoFr[3]);
//			break;
//		
//		case "단무지":
//			System.out.println(kakaoFr[4]);
//			break;
//		
//		default :
//			System.out.println(name + "는 없습니다. 올바른 이름을 괄호안에서 찾아 입력해주세요.");
//			break;
//		}
	
	}
}
