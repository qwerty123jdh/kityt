import java.sql.DriverManager;
import java.sql.SQLException;

public class DemoConnecton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   try {
			DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CITI", "sa", "sa123");
			System.out.println("GOT COnnection");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
