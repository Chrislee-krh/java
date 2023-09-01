package day12.quiz.en_decrypt;

import java.util.Scanner;

public class Practice {

    private static char encCode;
    public static String[] encArray = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", " ", "!", "@", "#", "$", ",", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    public static void main(String[] args) {
        enc();
    }

    static void enc() {
        String[] enc = new String[58];
        String[] newEncArray = new String[58];
        System.arraycopy(encArray, 0, newEncArray, 0, 58);
        System.out.print("암호화할 내용을 입력하세요> ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char charAtIndex = input.charAt(i);
            boolean found = false;

            for (int j = 0; j < 58; j++) {
                if (newEncArray[j].charAt(0) == charAtIndex) {
                    enc[i] = newEncArray[j];
                    found = true;
                    break;
                }
            }

            if (!found) {
                enc[i] = String.valueOf(charAtIndex);
            }
        }

        // 출력
        System.out.print("암호화된 결과: ");
        for (String character : enc) {
            System.out.print(character);
        }
    }
}


