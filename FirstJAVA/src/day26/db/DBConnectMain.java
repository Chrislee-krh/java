package day26.db;

import java.util.List;
import java.util.Scanner;

public class DBConnectMain {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		PersonsDAO dao = new PersonsDAO();
//		PersonsVO vo = new PersonsVO();
		
//		System.out.println("Persons 정보 입력(Insert): ");
//		System.out.println("성 입력: ");
//		vo.setLastName(scan.next());
//		System.out.println("이름 입력: ");
//		vo.setFirstName(scan.next());
//		System.out.println("나이 입력: ");
//		vo.setAge(scan.nextInt());
//		System.out.println("도시 입력: ");
//		vo.setCity(scan.next());
//		
//		int result = dao.insert(vo);
//		if(result != 0) {
//			System.out.println("SQL 입력 성공");
//		}else {
//			System.out.println("SQL 실패");
//		}
		
		// 전체 출력 확인
		List<PersonsVO> list = dao.allPersons();
		for(PersonsVO vo1 : list) {
			System.out.println(vo1);
		}
	
		// 수정
		System.out.println("<<수정하기>>");
		System.out.println("id = 13 정보 수정하기");
		PersonsVO vo = dao.selectOne(13);
		System.out.printf("수정할 성 입력하세요(" + vo.getLastName()+ ") :");
		String lastName = scan.next();
		if(!lastName.equals("")) {
			vo.setLastName(lastName);
		}
		System.out.printf("수정할 이름 입력하세요(" + vo.getFirstName()+ ") :");
		String firstName = scan.next();
		if(!firstName.equals("")) {
			vo.setLastName(firstName);
		}
		System.out.printf("수정할 도시 입력하세요(" + vo.getCity()+ ") :");
		String city = scan.next();
		if(!city.equals("")) {
			vo.setLastName(city);
		}
		System.out.printf("수정할 나이 입력하세요(" + vo.getAge()+ ") :");
		int age = scan.nextInt();
		if(age != 0 && age >=0) {
			vo.setAge(age);
		}
		
		int result = dao.updatePersons(vo);
		if(result != 0) {
			System.out.println("수정성공");
		} else {
			System.out.println("수정 실패");
		}
		
		
		
		
		
		
		
		
//		System.out.println("수정할 아이디를 입력하세요> ");
//		int id = scan.nextInt();
//		int matchId = dao.updatePersons(dao.selectOne(id));
//		System.out.println("수정할 값이 있는 컬럼을 입력하세요.");
//		int con = scan.nextInt();
//		System.out.println("수정할 값이 문자라면 1, 숫자라면 2를 입력하세요>");
//		int option = scan.nextInt();
//		if(option == 1) {
//			System.out.println("변경을 원하는 문자열로 입력하세요.");
//			String var = scan.nextLine();
//			dao.updatePersons(vo);
//		} else if(option ==2) {
//			System.out.println("변경을 원하는 값을 입력하세요.");
//			int var = scan.nextInt();
//			
//		} else {
//			System.out.println("값을 다시 입력해주세요");
//		}
	}
}
