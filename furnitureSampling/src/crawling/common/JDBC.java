package crawling.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC {
	// 1. Connection ��ü�� ����
	// 2. ������ Connection ��ü�� close

	public static Connection getConnection() {
		Connection conn = null;

		String DName = "oracle.jdbc.driver.OracleDriver";

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "park";
		String password = "1234";

		try {
			Class.forName(DName); // 1
			conn = DriverManager.getConnection(url, user, password); // 2

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;

	}

////////////////////
	public static void disconnect(PreparedStatement pstmt,Connection conn) {

		try {
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
