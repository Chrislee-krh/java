package fromHome;

public class LastTwo {

	public static void main(String[] args) {
		
		System.out.println("7~9의 사이의 수의 합: " + sumNum(7,9));
		System.out.println("9~7의 사이의 수의 합: " + sumNum(9,7));
		System.out.println("5~5의 사이의 수의 합: " + sumNum(5,5));
	}
	
	static int sumNum(int a, int b) {
		
//	내답
		int sN = Math.min(a, b);
		int bN = Math.max(a, b);
		int sum = 0;
		if (a==b) return a;
		
		for (int i = sN; i<=bN; i++) {
			sum += i;
		}
		return sum;
	}
	
//	int result = 0;
//	if(a==b) return a;
//	
//	int max;
//	for (int i = (a>b)? b : a; i <= (max = a>b? a : b); i++) {
//		result += i;
//	}
//	return result;

	
//	20번
//		System.out.println("100의 약수의 개수: " + primeNum(100));
//			
//		}
//	
//	static int primeNum(int n) {
//		int cntN = 0;
//		for (int i = 2; i <=n; i++) {
//			int cnt = 0;
//			for (int j = 1; j <= i; j++) {
//				if(i%j == 0) cnt++;
//				else continue;
//			}
//			if(cnt==2) cntN ++;
//			else continue;
//		}
//		return cntN;
//	}
	
}