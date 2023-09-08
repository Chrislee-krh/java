package day16.file.quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class quiz1 {

	public static void main(String[] args) {

		File f = new File("E:\\filetest4");
		f.exists();
		if(!f.exists()) f.mkdir();
		else System.out.println("이미 존재");
		
		// 1)
		File file = new File("E:\\filetest4\\서시.txt");
		System.out.println(file.isDirectory());
		// 2)
		File dir = new File("E:\\filetest5\\testFile\\temp\\");
		dir.exists();
		if(!dir.exists()) dir.mkdirs();
				
		File file2 = new File("E:\\filetest5\\testFile\\\\temp\\\\서시.txt");
		file.renameTo(file2);
		
		// 3)
		
		FileReader in = null;
		try {
			in = new FileReader(file2);
			while(true) {
				int lyrics = in.read();
				System.out.print((char)lyrics);
				if(lyrics == -1) break; 
			}
		} catch (Exception ie) {
			ie.printStackTrace();
		} finally {
			try {in.close();} catch (Exception e2) {e2.printStackTrace();}
		}

	
		
	}

}
