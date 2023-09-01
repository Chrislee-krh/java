package day12.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class AutoResourceManagerExample {

	public static void main(String[] args) {
		
		try (FileInputStream in = new FileInputStream("a.txt")){ //a.txt에서 읽어서 in.read를 통해 출력하겠다.
			System.out.println("read data: " + in.read());
		} catch (NullPointerException | IOException ex) {
//			System.out.println(in); // in 변수 참조 못함. 지역변수라서.
			System.out.println("예외 처리합니다.");
			System.out.println(ex.toString());
		}
		
		FileInputStream in2 = null;  // 블럭 밖에서 선언했기 떄문에 아래의 sysout(in2)는 참조 가능해진다.
		try {
			in2 = new FileInputStream("a.txt");
			System.out.println("read data: " + in2.read());
		} catch (NullPointerException ex) {
			System.out.println("예외 처리합니다.");
			System.out.println(ex.toString());
		} catch (IOException ex) {
			System.out.println(in2);
			System.out.println("예외처리합니다.");
			System.out.println(ex.toString());
		} finally {  // 위에서 참조했었기 때문에, 마지막에 열린 객체를 정리하기 위해서 finally를 써야한다. 
			try {in2.close();} catch(IOException e) {}  // close에서 IOException이 또 발생할 수 있어서.
		}
		
	}

}
