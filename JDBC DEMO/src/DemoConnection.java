import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection connection=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CITI12131", "sa", "sa123");
		System.out.println("connection successful");
		
		String INSERT_EMPLOYEE="insert into employdee values(1,'City',1000)";
		Statement statement= connection.createStatement();
		int rows= statement.executeUpdate(INSERT_EMPLOYEE);
		System.out.println("row inserted"+rows);
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
