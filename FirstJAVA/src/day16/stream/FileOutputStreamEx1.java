package day16.stream;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileOutputStreamEx1 {

	public static void main(String[] args) {
		// 문자열을 입력받아서 해당 문자열을 파일로 내보내기
		
		// 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("파일 명을 입력하세요: ");
		String name = scan.next();
		
		// 빈 객체 선언
		OutputStream fos = null;
		
		try {
			// fileOutputStream(파일을 쓸 경로를 지정)
			fos = new FileOutputStream("E:\\Develop\\Java\\FirstJAVA\\file\\" + name + ".txt"); // \\ 쓴 이유는 이스케이프 문자
			
			System.out.print("문장 입력: ");
			scan.nextLine(); // 버퍼 정리(위의 scan.next에서 엔터를 쳤을 때 그 엔터값을 정리하기 위해 존재)
			String str = scan.nextLine();
			
			byte[] bs = str.getBytes();
			
			fos.write(bs); // 주 메서드
			System.out.println("파일이 정상적으로 저장됨");
			
		} catch (Exception ie) {
			ie.printStackTrace();
		} finally {
			try {
				fos.close();
				scan.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
