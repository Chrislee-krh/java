package day16.stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx1 {

	public static void main(String[] args) {
		
		File f = new File("E:\\Develop\\Java\\FirstJAVA\\file\\w.txt");
		
		// new FileWriter(File f, boolean append)
		// File f: 쓰고자 하는 파일 객체의 정보
		// append: true면 파일에 추가하면서 쓰는 기능(기본값: false)
		
		FileWriter out = null; // 객체 선언
		try {
			// Filewriter 객체 생성
			out = new FileWriter(f, true); // false면 지우고 새로 쓰고 끝냄. true면 계속 내용을 쌓아감
			out.write("테스트를 위한 메세지\n");
			out.write("테스트를 위한 메세지2\n");
			out.append("테스트를 위한 메세지3\n");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(out != null)
				try {out.close();} catch (IOException e2) {}
		}
		
	}

}
