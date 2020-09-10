package DBTest;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String sql = "select * from employee";
		Connection conn = null;
		java.sql.Statement st = null; // DB와 소통하는 통로

		ResultSet rs = null; // 결과 받아서 처리할때
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver load 성공!");
			conn = DriverManager.getConnection(url, "scott", "hr");
			System.out.println("DB 연결 성공!");

			st = conn.createStatement();
			rs = st.executeQuery(sql); // 쿼리 실행 후 데이터들이 rs 저장
			while (rs.next()) { // 한건씩 처리
				String empName = rs.getString(1); // 첫번째 칼럼 조회
				System.out.println(empName);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("driver load 실패!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 연결 실패!");
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (st != null)
					st.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
