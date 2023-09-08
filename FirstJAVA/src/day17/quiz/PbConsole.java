package day17.quiz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PbConsole {
	static Map<String, Map<Integer,String>> pb = new HashMap<>();
	static Map<Integer,String> info = new HashMap<>();
	static Scanner sc = new Scanner(System.in);
//	Map group = new HashMap();
//	Map info = new HashMap();

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		
		while (true) {
			System.out.println("==== What to do ====");			
			System.out.println("1. New Group");
			System.out.println("2. Print");
			System.out.println("3. New Address");
			System.out.println("4. Find Phone");
			System.out.println("5. Find Name");
			System.out.println("6. Exit");
			System.out.print("> ");
			int behavior = sc.nextInt();
			sc.nextLine();
			
			switch (behavior) {
			case 1:
				doNewGroup();
				break;
			case 2:
				printAll();
				break;
			case 3:
				doNewAddress();
			case 4:				
			case 5:
			case 6:
			default:
				break;
			}
		}		
	}

	public static void doNewGroup() {

		System.out.print("그룹의 이름: ");
		String g = sc.nextLine();
		pb.put(g, info);
	}
	
	public static void printAll() {
		Set<Map.Entry<String, Map<Integer,String>>> s = pb.entrySet();
		System.out.println(s);
	}
	
	public static void doNewAddress() {
		System.out.println("전번과 이름을 입력한 회원 정보를 입력하세요");
		System.out.print("전화번호>");
		int pNum = sc.nextInt();
		System.out.println();
		System.out.print("이름>");
		String name = sc.next();
		System.out.println();
		info.put(pNum, name);
		
	}
	
}


//public static void main(String[] args) {
//    // 외부 해시맵 생성
//    Map<String, Map<String, String>> outerMap = new HashMap<>();
//
//    // 내부 해시맵 생성
//    Map<String, String> innerMap = new HashMap<>();
//    innerMap.put("key1", "value1");
//    innerMap.put("key2", "value2");
//
//    // 외부 해시맵에 내부 해시맵 추가
//    outerMap.put("innerMapKey", innerMap);
//
//    // 값을 가져오기
//    String value = outerMap.get("innerMapKey").get("key1");
//    System.out.println(value); // 출력: value1


