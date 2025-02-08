import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test01_Connection {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		
		final String DB_DRIVER= "oracle.jdbc.driver.OrcleDriver";
		final String DB_URL="jdbc:oracle:thin:@localhost:1521:ORCL";
		final String DB_USN="system";
		final String DB_PWD="tiger";
		
		Class.forName(DB_DRIVER);
		
		Connection con=DriverManager.getConnection(DB_URL,DB_URL,DB_PWD);
		
		System.out.println(con);
		
	}

}
