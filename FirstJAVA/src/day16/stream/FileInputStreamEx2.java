package day16.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamEx2 {

	public static void main(String[] args) {
		
		// 입력 스트림 객체를 생성
		InputStream fis = null;
		try {
			fis = new FileInputStream("E:\\Develop\\Java\\FirstJAVA\\file\\test.txt");
			
			// 입력한 데이터를 저장할 변수 선언
			byte[] buffer = new byte[256];
			int readCount = fis.read(buffer); // 처음 블록을 읽기
			while(readCount != -1) { // -1이 아니면 데이터가 있다는 뜻
//				String data = new String(buffer); // 가능 방법1
				String data = new String(buffer, 0, readCount);
				System.out.print(data);
				readCount = fis.read(buffer); // 다음 블록을 읽기 시작
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally{ 
			 try {fis.close();} catch (Exception e2) {e2.printStackTrace();}
		}
		
		
		
	}

}
