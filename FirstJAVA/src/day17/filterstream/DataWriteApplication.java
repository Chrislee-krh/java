package day17.filterstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

import util.Closure;

public class DataWriteApplication {

	public static void main(String[] args) {

		// 파일 객체
		File file = new File("E:\\Develop\\Java\\FirstJAVA\\file\\customer.txt");
		// 노드 스트림
		FileOutputStream fos = null;
		// 필터 스트림 - Data
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			// DataInput/OutputStream은 데이터를 순서대로 추가, 불러올 때도 순서대로 불러야함.
			dos.writeUTF("홍길동"); dos.writeChar('M'); dos.writeUTF("hkd@test.com"); dos.writeInt(30);
			dos.writeUTF("홍길년"); dos.writeChar('F'); dos.writeUTF("hkn@test.com"); dos.writeInt(62);
			System.out.println("File Saved");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(dos!=null) Closure.close(dos);
			if(fos!=null) Closure.close(fos);
		}
	
		FileInputStream fis = null;
		DataInputStream dis = null;
		String line = null;
		try {
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			String name = null;
			while(dis.available()>0) {
				System.out.println(dis.readUTF()); // 이름
				System.out.println(dis.readChar()); // 성별
				System.out.println(dis.readUTF()); // 이메일
				System.out.println(dis.readInt()); // 나이
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally { 
			if(dis!=null) Closure.close(dis);
			if(fis!=null) Closure.close(fis);
		}
	}
}



//line = dis.readLine();
//String[] data = line.split(" ");

//if(line != null) {
//	System.out.println(Arrays.toString(data));	
//}
