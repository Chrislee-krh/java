package day27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day26.db.PersonsVO;


public class MariaDBConnect {
	static Scanner sc = new Scanner(System.in);
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	
	public static void main(String[] args) {
		// 객체 생성
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		PersonsVO vo = new PersonsVO();
		PersonsDao dao = new PersonsDao();
		try {
			// 1.드라이버 로드
			Class.forName("org.mariadb.jdbc.Driver");
			
			// 2. 데이터베이스 연결을 위한 Connection
			conn = DriverManager.getConnection(
					"jdbc:mariadb://localhost:13306/testdb",
					"root",
					"root1234");
			System.out.println(conn);
			System.out.println("데이터베이스 접속 성공");		
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
			System.out.println(e.getMessage());
		} catch (SQLException sqle) {
			System.out.println("SQL 연동 실패");
			System.out.println(sqle.getMessage());
		}
		
		System.out.println("데이터베이스 프로그램 시작");
		System.out.println("메뉴를 선택하세요. [A]1. 전체조회, [O]2. 선택조회, [I]3. 레코드 추가, [U]4. 레코드 수정, [D]5. 레코드 삭제");
		String menu = sc.nextLine();
		menu = menu.toLowerCase();
		
		switch (menu.charAt(0)) {
		
		case 'a':
		case 'A':
		case 'ㅁ':
			System.out.println("전체 조회를 시작합니다.");
			printAllData();
			break;
			
		case 'o':
		case 'O':
		case 'ㅐ':
			System.out.println("선택 조회를 시작합니다.");
//			printSingleData();
			break;
			
		case 'i':
		case 'I':
		case 'ㅑ':
			System.out.println("레코드를 추가를 시작합니다.");
			dao.insertData();
			break;
			
		case 'u':
		case 'U':
		case 'ㅕ':
			System.out.println("레코드를 수정을 시작합니다.");
			dao.updateData(1);
			break;
			
		case 'd':
		case 'D':
		case 'ㅇ':
			System.out.println("해당 레코드 삭제를 시작합니다.");
			dao.deleteSingleData(1);
			break;
		default:
			System.out.println("잘못된 메뉴를 선택하셨습니다.");
			break;
		}	
	}
//	printAllData();printSingleData();insertData();updateData();deleteSingleData();
	public static List<PersonsVO> printAllData(){
		List<PersonsVO> list = new ArrayList<>();
		PersonsVO vo = new PersonsVO();
		
		String sql = "select * from Persons";
		try {
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				vo.setId(rs.getInt("id"));
				vo.setLastName(rs.getNString("lastName"));
				vo.setFirstName(rs.getNString("firstName"));
				vo.setAge(rs.getInt("age"));
				vo.setCity(rs.getNString("city"));
				list.add(vo);
			}
			System.out.println(list.toString());
			
		} catch (SQLException e) {
			System.out.println("sql 실패");
			System.out.println(e.getMessage());
		}
		return list;
	}
	
	public static PersonsVO printSingleData(int id) {
		PersonsVO vo = null;
		
		String sql = "select * from Persons where = " + id;
		try {
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				vo = new PersonsVO();
				vo.setId(rs.getInt("id"));
				vo.setFirstName(rs.getString("firstName"));
				vo.setLastName(rs.getNString("lastName"));
				vo.setAge(rs.getInt("age"));
				vo.setCity(rs.getString("city"));
			} else {
				System.out.println("찾는 DB가 없습니다.");
			}		
		} catch (SQLException e) {
			System.out.println("sql 실패");
			System.out.println(e.getMessage());			
		}
		return vo;
	}
	
	
//	public static int updateData(PersonsVO vo) {
//		int result = 0;
//		
//		System.out.println("성, 이름, 나이, 도시 순서로 내용을 입력하세요.");
//		System.out.println("Persons 정보 입력(Insert): ");
//		System.out.println("성 입력: ");
//		String lastName = sc.next();
//		System.out.println("이름 입력: ");
//		String firstName = sc.next();
//		System.out.println("나이 입력: ");
//		int age = sc.nextInt();
//		System.out.println("도시 입력: ");
//		String city = sc.next();
//		String sql = "insert into Persons (lastName, firstName, age, city)"
//				+ "values('"+ lastName +"','"+ firstName +"',"+
//				age+",'"+city+"')";
//		try {
//			stmt = conn.createStatement();
//			result = stmt.executeUpdate(sql);
//			
//		} catch (SQLException e) {
//			System.out.println("sql 실패");
//			System.out.println(e.getMessage());
//		} finally {
//			try {
//				if(stmt!=null) stmt.close();
//			} catch (Exception e2) {}
//		}
//		return result;
//	}
//	
}
