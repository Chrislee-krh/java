package day06;

import java.util.Scanner;

public class CustomerManager {

	// 배열에 저장될 최대 고객의 수
	static final int MAX = 100;
	
	// 고객 정보를 저장할 변수를 배열로 선언(필드): 이름, 성별, 이메일, 출생년도
	static String[] nameList = new String[MAX]; // 이름 저장
	static String[] genderList = new String[MAX]; // 성별 저장
	static String[] emailList = new String[MAX]; // 이메일 저장
	static int[] birthYearList = new int[MAX]; // 출생년도 저장
	
	// 배열을 참조하기 위해서 인덱스가 필요
	static int index = -1; 	// 배열은 0부터 시작하기 때문에, 최초 index는 -1이어야 한다.(참조할땐, 처음엔 기초값이라(0이나 null) 값이 없어서, 처리 중에 문제가 생길 수 있다.)
							// 참조하지 않기 위해, -1을 써서 넘겨버린다.
	
	// 배열에 처음 선언한 크기보다 같거나 작은 개수의 자료를 저장
	// 그래서, 현재 데이터가 몇개 저장되어 있는지 알 수 있는 변수를 선언해야 한다.(그래야 컴퓨터가 들어간 갯수의 데이터만 확인하고, 매번 100개 전체를 보지 않아도 된다.)
	static int cnt = 0; // 저장 개수
	
	// 기본 입력장치로부터 데이터를 입력 받기 위해, Scanner객체 선언
	static Scanner scan = new Scanner(System.in);
			
	
	public static void main(String[] args) {
		// 고객 관리 프로그램의 메뉴
		while(true) { // 종료하면 안되고 계속 써야하기 때문에 true
			// 고객 메뉴 ui(Text UI)
			System.out.printf("\n[INFO] 고객 수: %d, 인덱스: %d\n", cnt, index);
			System.out.println("메뉴를 입력하세요.");
			System.out.println("(I)nsert, (P)revious, (N)ext, (C)urrent, (U)pdate, (D)elete, (Q)uit");
			System.out.print("메뉴 입력: ");
			String menu = scan.next();
			menu = menu.toLowerCase();
			// 메뉴 선택시 동작을 구현(스위치를 보통 쓴다.)
			switch (menu.charAt(0)) { //key에는 양식을 쓴다
			case 'i':	//insert
				System.out.println("고객 정보를 입력을 시작합니다.");
				if(cnt >= MAX) System.out.println("더 이상 저장할 수 없습니다.");
				else {
					insertCustomerData();
					System.out.println("고객정보를 저장했습니다.");
				}
				break;
			case 'p':	//previous
				System.out.println("이전 데이터를 출력합니다.");
				if(index<=0) { //0이 최초 데이터기 때문에 -1로 시작한 index지만 0이하면 이전의 데이터가 없는 셈이다.
					System.out.println("이전 데이터가 존재하지 않습니다.");
				} else {
					index--;
					printCustomerData(index);
				}
				break;
			case 'n':	//next
				System.out.println("다음 데이터를 출력합니다.");
				if(index>=cnt-1) {
					System.out.println("다음 데이터가 존재하지 않습니다.");
				} else {
					index++;
					printCustomerData(index);
				}
				break;
			case 'c':	//current		//printCustomerData가 여기서 필요하다. 현재 데이터 출력을 위해!
				System.out.println("현재 데이터를 출력합니다.");
				if((index >= 0)&&(index < cnt)) { //index가 0이 되는 순간부터 정보가 있다는 말
					printCustomerData(index);
				} else System.out.println("출력할 데이터가 선택되지 않았습니다.");
				break;
			case 'u':	//update
				System.out.println("데이터를 수정합니다.");
				if((index>=0)&&(index<cnt)) {
					System.out.println(index + "번째 데이터를 수정합니다.");
					updateCustomerData(index);
				}
				//내답
//				if((index>=0)&&(index<cnt)) {
//					System.out.print("이름: ");
//					String name = scan.next();
//					System.out.print("성별(M/F): ");
//					String gender = scan.next();
//					System.out.print("이메일 주소를 입력하세요: ");
//					String email = scan.next();
//					System.out.print("출생년도를 입력하세요: ");
//					int birthYear = scan.nextInt();
//					
//					// 고객 객체를 배열에 저장
//					nameList[index] = name;
//					genderList[index] = gender;
//					emailList[index] = email;
//					birthYearList[index] = birthYear;
//				}	
				
				break;
				
			case 'd':	//delete
				System.out.println("데이터를 삭제합니다.");
				if((index>=0)&&(index<cnt)) {
					//for(<cnt)
					deleteCustomerData(index);
				} else {
					System.out.println("삭제할 데이터가 선택되지 않았습니다.");
				}
				break;
				
			case 'q':	//quit
				System.out.println("프로그램을 종료합니다.");
				scan.close();// 멤버(최초 클래스 아래)에 있는 scan을 종료
				System.exit(0);// 프로세스 종료
				break;

			default:	//이외의 키를 입력했을 때
				System.out.println("메뉴를 잘못 입력했습니다.");
				break;
			}
		}

	}
	
	// 고객 데이터 입력 추가
	public static void insertCustomerData() { //매개변수도 반환값도 없다.
		// 이름, 성별, 이메일, 출생년도
		System.out.print("이름: ");
		String name = scan.next();
		System.out.print("성별(M/F): ");
		String gender = scan.next();
		System.out.print("이메일 주소를 입력하세요: ");
		String email = scan.next();
		System.out.print("출생년도를 입력하세요: ");
		int birthYear = scan.nextInt();
		
		// 고객 객체를 배열에 저장
		nameList[cnt] = name;
		genderList[cnt] = gender;
		emailList[cnt] = email;
		birthYearList[cnt] = birthYear;
		cnt++;	//cnt번째 배열에 객체를 저장하고, cnt값 증가!
	}
	
	// 현재 고객 정보 출력
	public static void printCustomerData(int index) { //데이터를 받아와야해서 매개변수가 필요하다. 저장공간이 다른 매개변수(위와는 상관이 없다)
		System.out.println("==========CUSTOMER INFO===============");
		System.out.println("이름: " + nameList[index]);
		System.out.println("성별: " + genderList[index]);
		System.out.println("이메일: " + emailList[index]);
		System.out.println("출생년도: " + birthYearList[index]);
		System.out.println("======================================");
	}
	
	public static void updateCustomerData(int index) {
		System.out.println("----------UPDATE CUSTOMER INFO----------");
		System.out.print("이름("+nameList[index]+") :");
		String name = scan.nextLine();
			if(name.length()!=0) nameList[index] = name;
		nameList[index] = scan.next();
		System.out.print("성별("+genderList[index]+") :");
		genderList[index] = scan.next();
		System.out.print("이메일("+emailList[index]+") :");
		emailList[index] = scan.next();
		System.out.print("출생년도("+birthYearList[index]+") :");
		birthYearList[index] = scan.nextInt();
	}
	
	// 쌤답
	public static void deleteCustomerData(int index) {
		for (int i = index; i < cnt - 1; i++) {
		    nameList[i] = nameList[i + 1];
		    genderList[i] = genderList[i + 1];
		    emailList[i] = emailList[i + 1];
		    birthYearList[i] = birthYearList[i + 1];
			}
			cnt--;
	}
	
	
	// 내답
//	public static void eraseCustomerData() {
//				
//		while(index-1<cnt) {
//		nameList[index] = nameList[index+1];
//		genderList[index] = genderList[index+1];
//		emailList[index] = emailList[index+1];
//		birthYearList[index] = birthYearList[index+1];
//		}
//		cnt--;
//			if(cnt == 1) {
//				nameList[index] = null;
//				genderList[index] = null;
//				emailList[index] = null;
//				birthYearList[index] = 0;
//			}
//	}
	
	
//	public static void eraseCustomerData() {
//	    if (cnt <= 0) {
//	        return; // No data to erase
//	    }
//
//	    for (int i = index; i < cnt - 1; i++) {
//	        nameList[i] = nameList[i + 1];
//	        genderList[i] = genderList[i + 1];
//	        emailList[i] = emailList[i + 1];
//	        birthYearList[i] = birthYearList[i + 1];
//	    }
//
//	    cnt--;
//
//	    // Reset the last element
//	    nameList[cnt] = null;
//	    genderList[cnt] = null;
//	    emailList[cnt] = null;
//	    birthYearList[cnt] = 0;
	
	
}
