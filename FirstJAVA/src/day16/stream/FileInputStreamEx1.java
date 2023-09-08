package day16.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamEx1 {

	public static void main(String[] args) {
		InputStream fis = null;
		 try {
			// FileInputStream(읽을 파일의 경로)
			 fis = new FileInputStream("E:\\Develop\\Java\\FirstJAVA\\file\\test.txt");
			 byte[] buffer = new byte[1000];
			 String content = "";
			 while(true) {  // buffer을 썼을 때, 실제 들어간 내용이 얼마나 있는지 알 수 없기 때문에 buffer의 크기가 실제 값보다 적다면
				 			// buffer을 벗어난 것들은 다시 위의 .read()처럼 1바이트씩 읽어 깨져서 출력된다.
//				 int data = fis.read();
//				 System.out.println((char)data); // read()는 1 바이트씩 읽음.char은 2바이트
				 int data = fis.read(buffer); // 1바이트씩이지만 2
				 System.out.println(data);
				 if(data != -1) {
					content = new String(buffer, 0, data);
					 
				 } else break;
//				 
//				 if(data == -1) // data가 -1인 경우는 더이상 데이터가 없는 경우
//					 break;
				 System.out.println(content);
			 }
			 
		} catch (FileNotFoundException e) {
			System.out.println("해당 경로의 파일을 찾을 수 없습니다.");
		} catch (IOException e2) {
				System.out.println("파일을 읽을 수 없습니다.");
		} finally {
			try {
				fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}

}
