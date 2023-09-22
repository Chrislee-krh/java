package day27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import day26.db.PersonsVO;

public class PersonsDao {
	static Scanner sc = new Scanner(System.in);
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
//		PersonsVO vo = new PersonsVO();
		
		public PersonsDao() {
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
		}
		
		public int insertData() {
			int result = 0;
			PersonsVO vo1 = new PersonsVO();
			System.out.println("성, 이름, 나이, 도시 순서로 내용을 입력하세요.");
			System.out.println("성 입력: ");
			String lastName = sc.next();
			System.out.println("이름 입력: ");
			String firstName = sc.next();
			System.out.println("나이 입력: ");
			int age = sc.nextInt();
			System.out.println("도시 입력: ");
			String city = sc.next();
			String sql = "insert into Persons (lastName, firstName, age, city)"
					+ "values('"+ lastName +"','"+ firstName +"',"+
					age+",'"+city+"')";
			try {
				stmt = conn.createStatement();
				result = stmt.executeUpdate(sql);
				
			} catch (SQLException e) {
				System.out.println("sql 실패");
				System.out.println(e.getMessage());
			} finally {
				try {
					if(stmt!=null) stmt.close();
				} catch (Exception e2) {}
			}
			return result;
		
		}
		public int updateData(int id) {
			PersonsVO vo = new PersonsVO();
			String sql = "select * from Persons where id = " + id;
			int result = 0;
//			String sql = "insert into Persons (lastName, firstName, age, city)"
//					+ "values('"+ lastName +"','"+ firstName +"',"+
//					age+",'"+city+"')";
			try {				
				stmt = conn.createStatement();
				result = stmt.executeUpdate(sql);
				if(rs.next()) {
					System.out.println("성, 이름, 나이, 도시 순서로 내용을 입력하세요.");
					System.out.println("성 입력: ");
					vo.setLastName(sc.next());
					System.out.println("이름 입력: ");
					vo.setFirstName(sc.next());
					System.out.println("나이 입력: ");
					vo.setAge(sc.nextInt());
					System.out.println("도시 입력: ");
					vo.setCity(sc.next());
				}
			} catch (SQLException e) {
				System.out.println("sql 실패");
				System.out.println(e.getMessage());
			} finally {
				try {
					if(stmt!=null) stmt.close();
				} catch (Exception e2) {}
			}
			return result;
		}
	
		public int deleteSingleData(int id) {
		int result = 0;
		String sql = "delete from Persons where id= " + id;
		
		try {
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("sql 입력 실패");
			System.out.println(e.getMessage());
		}	
		return result;
		}
}
