package day17.filterstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import util.Closure;

public class StringinputExample {

	public static void main(String[] args) {
		// 한줄씩 입력 받아서 내용을 저장
		File file = new File("E:\\Develop\\Java\\FirstJAVA\\file\\stringline.txt");
		InputStreamReader isr = null; // 키보드 입력값 처리
		BufferedReader br = null; 
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		String inputString;
		System.out.println("저장할 내용을 입력 후 Crtl+z를 눌러주세요.");
		try {
			isr = new InputStreamReader(System.in); // byte -> char 바꿈
			br = new BufferedReader(isr); // 버퍼로 읽고
			
			fos = new FileOutputStream(file); // 노드 스트림
			osw = new OutputStreamWriter(fos); // byte -> char 바꿈
			bw = new BufferedWriter(osw); // 버퍼로 저장
			
			while((inputString = br.readLine()) != null) {
				bw.write(inputString + "\n");
//				bw.newLine();
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(br != null) Closure.close(br);
			if(bw != null) Closure.close(bw);
		}
		
	}

}
