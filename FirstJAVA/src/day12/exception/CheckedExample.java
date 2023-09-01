package day12.exception;

import java.io.IOException;

// CheckedException의 경우에는 반드시 예외처리필요
// 올바르게 설계되어 있어도 사용자가 잘못된 값을 입력하면 예외가 발생.
// e.g)IOException, FileNotFoundException, SQLException

public class CheckedExample {

	public static void main(String[] args) {
		System.out.println("값을 입력받는 프로그램!");
		
		byte[] data = new byte[100]; //한번에 100바이트씩 읽겠다는 의미
		
		try {
			System.in.read(data);
		} catch (IOException ie) {
			ie.printStackTrace();
		}
		
		System.out.print("입력한 문자열: ");
		System.out.println(new String(data).trim());
	}
}
