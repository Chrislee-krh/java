package day02.cal;

public class BitShiftExample {

	public static void main(String[] args) {
		//비트 이동 연산자: <<, >>, >>>
		
		int a = 192; //0b...1100_0000
		System.out.println("a(192)\t" + toBinaryString(a) + "\t" + a);
	
		//쉬프트 연산
		//한 칸 이동마다 2^(applied number)만큼을 곱해줘도 된다.
		//양수일 땐 0으로 채워지고, 음수일 땐 1로 채운다.
		//정수처리이기때문에 만약 11이 오른쪽 끝에 있을 때 0으로 밀어내면 숫자는 버려진다.(int로 나누기 할 때를 생각해보자.)
		
		int a1 = a << 3;
		System.out.println("\na<<3\t" + toBinaryString(a1)+"\t" + a1);

		int a2 = a >>7 ;
		System.out.println("\na>>7\t" + toBinaryString(a2)+"\t" + a2);
		
		a = -192;
		System.out.println("a(-192)\t" + toBinaryString(a)+"\t" + a);
		
		int a3 = a << 3 ;
		System.out.println("\na<<3\t" + toBinaryString(a3)+"\t" + a3);
		
		int a4 = a >> 3 ;
		System.out.println("\na>>3\t" + toBinaryString(a4)+"\t" + a4);
		
		int a5 = a >>> 3;
		int a6 = a >>> 32;
		System.out.println("a>>>3\t" + toBinaryString(a5)+"\t" + a5);
		System.out.println("a>>>32\t" + toBinaryString(a6)+"\t" + a6);
	}

	
	private static String toBinaryString(int num) { //binary(01010)등의 형태로 바꾸겠다 
		String a = Long.toBinaryString(num | 0xFFFFFFFF00000000L); // or연산자(둘 중 하나만 1이면 1)로 필요 내용을 처리하기 위해 뒤의 8자리를 0으로 해서 정리)
						//toBinaryString을 여기서 쓰는 이유는 아래의 binary를 출력하기 위함.
		return a.substring(32); //인덱스 32번째부터 출력해라.
	}
}
