package day17.filterstream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class TextWriterApplication {

	public static void main(String[] args) {
		String data1 = "홍길동, M, hkd@test.com, 30"; // ","는 필드, 컬럼 구분자
		String data2 = "Chris, M, chris@test.com, 25"; // "\n"는 레코드 구분자
		String data3 = "Lana, F, lana@test.com, 25";
		
		File f = new File("E:\\Develop\\Java\\FirstJAVA\\file\\" + "customer.txt");
		FileOutputStream fos = null;
		String data = null;
		FileReader input = null;
		BufferedReader br = null;
		
		try {
			fos = new FileOutputStream(f);
			fos.write(data1.getBytes());
			fos.write('\n'); // 레코드 구분자
			fos.write(data2.getBytes());
			System.out.println("File saved");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(fos!=null) try {fos.close();} catch (Exception e2) {}
		}

		try {
			input = new FileReader(f);
			br = new BufferedReader(input);
			data = br.readLine();
			String[] member = data.split(",");
			int age = Integer.parseInt(member[3].strip());
			if(age>= 20) {
				System.out.println(data);
			while(data != null) {  
				System.out.println(data);
			}
			}
		} catch (IOException e2) {
			System.out.println(e2.getMessage());
			e2.printStackTrace();
		} finally {
			if(br != null) try {br.close();} catch (Exception e2) {}
		}
	
	}

}
