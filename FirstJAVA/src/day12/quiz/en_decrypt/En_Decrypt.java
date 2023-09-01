package day12.quiz.en_decrypt;

import java.util.Scanner;

public class En_Decrypt {

	private static char encCode;
//	public static String[] encArray = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", " ", "!", "@", "#", "$", ",", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
	public static char[] encArray = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', '!', '@', '#', '$', ',', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	
	public static void main(String[] args) {
		enc();	
		dec();
	}

	static void enc() {
		char[] enc = new char[58];
		char[] newEncArray = new char[58];  // 쓸데없는 비번 원본 보존이었다.
		System.arraycopy(encArray, 0, newEncArray, 0, 58);
		System.out.print("암호화할 내용을 입력하세요> ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		for(int i = 0; i< input.length(); i++) {
			for(int j = 0; j<58; j++) {
				if(newEncArray[j] == input.charAt(i)) {
					if(j>53) {
						enc[i] = newEncArray[j-53];
					} else { enc[i] = newEncArray[j+5];}
					 
				} else { continue;
				}
			}		
		}
		
	    System.out.print("암호화된 결과: ");
	    for (char character : enc) {
	    	System.out.print(character);
	    }
	    System.out.println();
	}
	
	static void dec() {
		char[] enc = new char[58];
		char[] newEncArray = new char[58]; //역시나 마찬가지
		System.arraycopy(encArray, 0, newEncArray, 0, 58); 
		System.out.print("암호화할 내용을 입력하세요> ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		for(int i = 0; i< input.length(); i++) {
			for(int j = 0; j<58; j++) {
				if(newEncArray[j] == input.charAt(i)) {
					if(j<6) {
						enc[i] = newEncArray[j+53];
					} else { enc[i] = newEncArray[j-5];}
					 
				} else { continue;
				}
			}		
		}
		
	    System.out.print("암호화된 결과: ");
	    for (char character : enc) {
	    	System.out.print(character);
	    }
	}
}
