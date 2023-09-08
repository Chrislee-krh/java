package day16.stream;

import java.io.File;
import java.io.FileReader;

public class FileReadEx1 {

	public static void main(String[] args) {

		File f = new File("E:\\Develop\\Java\\FirstJAVA\\file\\w.txt");
		
		FileReader in = null; // filereader는 character stream이라 아까 byte로 읽을 떄와 달리 문자 char를 온전히 2바이트씩 그대로 읽어옴
		try {
			in = new FileReader(f);
			while(true) {
			int data = in.read();
//			System.out.printf("%X", data); // X 16진수
			System.out.println((char)data);
			if(data==-1) {
				break;
			}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {in.close();} catch(Exception e2) {e2.printStackTrace();}
		}
		
		
	}

}
