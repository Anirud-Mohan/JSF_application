import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "login")
@SessionScoped
public class login implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String verify() {

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@172.27.68.128:1521:O11JENG",
					"ORN11J_PROD_GENR", "ORN11J_PROD_GENR");

			PreparedStatement stmt = con.prepareStatement("SELECT * FROM emp_login");

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {

				String name = rs.getString("username");

				String password1 = rs.getString("password");

				System.out.println(name + "" + password1);

				if (name.equals(username) && password1.equals(password)) {

					System.out.println(name + "------" + password1);

					return "EMP_form.xhtml";

				}

			}

			con.close();

		} catch (Exception e) {

			System.out.println(e);

		}

		return "sign.xhtml";

	}
}
