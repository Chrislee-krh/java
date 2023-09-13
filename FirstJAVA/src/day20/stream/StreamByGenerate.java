package day20.stream;

import java.util.stream.Stream;

public class StreamByGenerate {

	static int num = 0; // generate으로 내부 값 변경하는 법
	
	public static void main(String[] args) {
		// generate() 메서드를 이용 Stream객체 생성
		
		// 리미트 설정 10개, 리미트 없으면 무한 반복(why? stream 크기 제한 없음)
		Stream<String> stream = Stream.generate(()-> "애국가").limit(10);
		
		// 숫자 바꾸기 가능
//		Stream<String> stream = Stream.generate(()-> 
//			"애국가" + (StreamByGenerate.num++)
//			).limit(10);
		
		// 안되는 걸로 보임
//		Stream<String> stream2 = Stream.generate(()-> 
//			"애국가" + (StreamByIterate(num, n -> n+1))
//			).limit(10);
			
		
		// 내부 반복자로 출력
		stream.forEach(s -> System.out.println(s));
	}

}
