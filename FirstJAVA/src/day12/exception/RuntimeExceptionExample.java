package day12.exception;

public class RuntimeExceptionExample {
	
	public static int makeException1(int input) { // ArithmeticException
		int divide = 0;
		int result = input/divide;
		return result;
	}
	
	public static void makeException2() { // StringIndexOutOfBoundsException
		String s = "가";
		System.out.println(s.charAt(1));
	}
	
	public static void makeException3() throws Exception{ // ArrayIndexOutOfBoundsException
		int[] a = {1,2,3};
		System.out.println(a[3]);
	}
	
	public static void makeException4() { // NullPointerException
		String nothing = null;
		System.out.println(nothing.split(""));
	}
	
	public static void makeException5() { // NumberFormatException
		String notInt = "가나다";
		int a = Integer.parseInt(notInt);
	}
	
	public static void makeException6() { // StackOverFlowError
		for(int i = 0; i< Integer.MAX_VALUE; i++) {
			makeException6();
		}
	}
	
	public static void makeException7() { // ArrayStoreException
		Object[] objArr = new String[3];  // Object에 다형성으로 객체 생성된 상태라, 입력되는 데이터 타입들은 여러가지로 들어가지만
		objArr[0] = 0;				      // 실제로, 처리할땐 문제가 생긴다.
	}
	
	public static void makeException8() { // ClassCastException  String을 integer로 바꾸려니 생김.
		Object[] objArr = new String[3];
		objArr[0] = "0";
		Integer a = (Integer) objArr[0];
	}
	
	public static void main(String[] args) throws Exception {
		// Runtime Exception  - Unchecked Exception
		makeException1(84);
		
		try {

			makeException2();
			makeException3();
			makeException4();
			makeException5();
			makeException6();
			makeException7();
			makeException8();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
