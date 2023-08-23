package day02;

public class intValueExample {

	public static void main(String[] args) {
		
		int decimalValue = 7;		//7
		int binValue = 0b1000_0101; //133
		int octalValue = 077;		//63
		int hexaValue = 0xFEFE;		//65278
				
				System.out.println("10진수 7은 " + decimalValue);
				System.out.println("2진수 1000_0101은 " + binValue);
				System.out.println("8진수의 077은 " + octalValue);
				System.out.println("16진수의 0xFEFE는 " + hexaValue);
	}

}
