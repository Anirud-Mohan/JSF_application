import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;

public class connection {
	private static Connection conn;
	private static final String DB_URL = "jdbc:oracle:thin:@172.27.68.128:1521:O11JENG";
	private static final String DB_USER = "ORN11J_PROD_GENR";
	private static final String DB_PASSWORD = "ORN11J_PROD_GENR";
	
	
	public int insertUser(String Name, int EID , String dept,int age,String gender,String email,String address) throws SQLException, Exception {
//	int nameExists=0;
	Class.forName("oracle.jdbc.driver.OracleDriver");  
	conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
	if(conn!=null) {
		System.out.print("Successfully Connected!!");
	}
	else {
		System.out.print("Connection Failed");
	}
//	PreparedStatement stmt1=conn.prepareStatement("select Name from employee");
//	ResultSet r1=stmt1.executeQuery();

	 PreparedStatement stmt = conn.prepareStatement("INSERT INTO employee (Name,EID,dept,age,gender,email,address) VALUES (?, ?, ?, ?, ?, ?, ?)"); 

		 stmt.setString(1, Name);
		 stmt.setInt(2, EID);
		 stmt.setString(3,dept);
		 stmt.setInt(4, age);
		 stmt.setString(5, gender);
		 stmt.setString(6,email);
		 stmt.setString(7, address);
		 int result=stmt.executeUpdate();
		return result;
}
}
