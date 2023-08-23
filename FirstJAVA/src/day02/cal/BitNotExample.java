package day02.cal;

public class BitNotExample {

	public static void main(String[] args) {
		// ~ : 2진수 각 비의 0,1을 반전. 0->1, 1->0
		byte binData = 0b0000_1000; 
		System.out.println(binData); //8
		System.out.println(~binData); //0b1111_0111
		System.out.println((byte)0b1111_0111); //
	
		boolean isTrue = false;
		System.out.println(!isTrue);
		
	}

}
