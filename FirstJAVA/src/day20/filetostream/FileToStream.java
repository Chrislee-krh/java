package day20.filetostream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileToStream {

	public static void main(String[] args) {

		try {
			// Paths.get() 메서드 사용
			Path path = Paths.get("src/day20/strstream/strToStream.java");
			Stream<String> stream = 
					// path로 읽어서 인코딩타입을 지정하는 추상 클래스 Charset으로 .뒤를 지정
					Files.lines(path, Charset.defaultCharset());
					// 아래도 가능함 
					Files.lines(path, Charset.forName("utf-8"));
					// ms959, euc-kr 등의 인코딩타입은 맞지 않아 출력안됨
//					Files.lines(path, Charset.forName("ms959"));
			
			stream.forEach(s -> System.out.println(s));
			stream.close(); // 이렇게해서  finally뒤에 if, close(); 등을 사용하지 않게 함.
			System.out.println();
			
			// BufferedReader의 lines() 메서드(반환 타입: Stream<String>) 이용
			File file = path.toFile(); // path를 file객체로 변환
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			br.lines().forEach(s -> System.out.println(s));
			br.close(); // 이렇게해서  finally뒤에 if, close(); 등을 사용하지 않게 함.
			
//			br.readLine(); // 스트림이 아니라서, forEach를 쓸 수 없다.
			
		} catch (Exception e) {
			e.printStackTrace();	
		} 
	}
}
