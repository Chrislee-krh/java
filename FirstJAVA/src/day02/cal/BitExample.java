package day02.cal;

public class BitExample {

	public static void main(String[] args) {
		// 비트 연산자: &, |, ^
		// & => and 연산 - 두 비트가 1일때 1, 이외는 0              
		// | => or 연산 - 두 비트 중 하나 이상 1일 때 1, 이외는 0
		// ^ => xor 연산 - 두 비트가 다를 때1, 같을 때는 0
		
		byte a = 5; //0b0000_0101
		byte b = 3; //0b0000_0011
		System.out.println(a&b); //0b0000_0001
		System.out.println(a|b); //0b0000_0111
		System.out.println(a^b); //0b0000_0110
		
		byte c = (byte)170; //0b1010_1010; 2 8 32 128
		byte d = 100;
		System.out.println("원래d: "+d);
		d = (byte)(d^c);
		System.out.println("c를 연산한 d: "+d);
		d = (byte)(d^c);
		System.out.println("c를 다시 연산한 d: "+d);
		
		//원문에 암호화를 하고 다시 푼 것.
		/*
		 * 0110_0100(100)
		 * 1010_1010(170)
		 * 1100_1110(d^c처리) -> -50
		 * 1010_1010(170)
		 * 0110_0100(두 번재 d^c처리) -> 100
		 */
	}
}
