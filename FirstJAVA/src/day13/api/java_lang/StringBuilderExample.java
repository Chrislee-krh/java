package day13.api.java_lang;

public class StringBuilderExample {

	public static void main(String[] args) {
		// StringBuilder
		
		String str = "Hello, world! 1234567890";
		StringBuilder sb = new StringBuilder(str);
		System.out.println("StringBuilder에 있는 문자열: " + sb);

		// 1. append
		sb.append(10);
		System.out.println("append(10)의 결과: " + sb);
		sb.append(true);
		System.out.println("append(true)의 결과 " + sb);
		
		//2. insert
		sb.insert(7, "insert합니다.");
		System.out.println("insert의 결과:" + sb);
		
		// 3. delete(시작 index, 끝 index)
		sb.delete(sb.indexOf("insert"), sb.indexOf("insert") +" insert합니다.".length());
		System.out.println("delete 결과: " + sb);
		
		// 4. deleteCharAt()
		sb.deleteCharAt(12);
		System.out.println("deleteCharAt(12) 결과: " + sb);
		
		// 5. setCharAt() //값을 변경함.
		sb.setCharAt(12, '!');
		
		// 6. replace()
		sb.replace(12, 14, "! 1");
	
		// 7. reverse()
		sb.reverse();
		System.out.println("reverse() 결과: " +sb);
		
	}

}
