package day16.file;

import java.io.File;

public class Directory {

	public static void main(String[] args) {
		// File 객체는 파일에 대한 정보를 담고 있는 객체
		
		File dir = new File("E:\\filetest");
		
		System.out.println("현재 경로에 파일이 존재함? " + dir.exists());
		
		if(dir.exists()) {
			System.out.println("디렉터리 확인");
		} else {
			dir.mkdir();
			System.out.println("디렉터리 생성");
		}
	}

}
