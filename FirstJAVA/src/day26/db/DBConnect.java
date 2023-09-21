package day26.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnect {

	public static void main(String[] args) {
		// JDBC 연동테스트
		// 데이터베이스 접속 객체(Connection 클래스)
		Connection conn = null;
		
		// CheckedException: SQL
		try {
			// 1. 드라이버 로드
			// mysql 사용 드라이버
			// MySQL 6.xx 버전 미만: com.mysql.jdbc.Driver
			// MySQL 6.xx 버전 이후: com.mysql.cj.jdbc.Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. Connection 객체 생성 - DriverManager
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb",
					"root", 
					"root1234");
			// url -> JDBC 연결을 위한 주소
			// MySQL 6.xx 버전 미만: jdbc:mysql: // 호스트이름:포트번호/DB이름
			// MySQL 6.xx 버전 이후: jdbc:mysql: // 호스트이름:포트번호/DB이름?ServerTimeZone=UTC
			// 위의 코드 뒤에 연결해서 사용 가능. SSL설정 오류 발생시 &&useSSL=false 추가
			System.out.println(conn);
			System.out.println("데이터베이스 접속 성공!");
			
			// 3. Statement 객체 생성(createStatement())
			Statement stmt = conn.createStatement();
			
			// 4. SQL 작성
			String sql = "Insert into Persons (firstname,lastname,age,city)"
					+	"values('Chris','Lee',18,'Sanfrancisco')";
			
			// 5. Statement 객체를 통해서 작성된 SQL을 실행
			int result = stmt.executeUpdate(sql);
			if(result != 0) System.out.println("insert SQL 성공");
			else System.out.println("SQL 실패");
			
			String sql2 = "Update Persons set ID = 12 where ID = 16";
			int result2 = stmt.executeUpdate(sql2);
			if(result2 != 0) System.out.println("Update SQL 성공");
			else System.out.println("SQL 실패");
			
			String sql3 = "Delete from Persons where id = 14";
			int result3 = stmt.executeUpdate(sql3);
			if(result3 != 0) System.out.println("Delete SQL 성공");
			else System.out.println("SQL 실패");
			
		} catch (ClassNotFoundException ce) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException sqle) {
			System.out.println("SQL 연동 오류");
			System.out.println(sqle.getMessage());
		} finally {
			try {if(conn!=null)	conn.close();} catch (Exception e) {}
		}

	}

}
