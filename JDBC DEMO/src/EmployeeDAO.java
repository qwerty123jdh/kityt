import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pojos.Employee;

public class EmployeeDAO {
	public int addEmployee(Employee emp)
	{
		String INSERT_EMPLOYEE="insert into employdee values(?,?,?)";
		int r=0;
		try {
			PreparedStatement ps= MyConnection.getMyConnection().prepareStatement(INSERT_EMPLOYEE);
			ps.setInt(1, emp.getEmpId());
			ps.setString(2, emp.getName());
			ps.setInt(3, emp.getSalary());
			r=ps.executeUpdate();
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
	}
	
	public List<Employee> findAllEmployees()
	{
		List<Employee> employees= new ArrayList<>();
		Connection con=MyConnection.getMyConnection();
		String FIND_ALL_EMPLOYEES="select * from employdee";
		
		 try {
				Statement st= con.createStatement();
				ResultSet set=st.executeQuery(FIND_ALL_EMPLOYEES);
				while(set.next())
				{
					int empId=set.getInt(1);
					String name=set.getString(2);
					int salary=set.getInt(3);
					Employee emp= new Employee(empId,salary,name);
					employees.add(emp);
				}
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return employees;
	}

	public Employee updateEmployee(int empId, Employee employee)
	{
		Employee emp= new Employee();
		String UPDATE_EMPLOYEE="update employdee set sal=? where empId=?";
		try {
			PreparedStatement ps= MyConnection.getMyConnection().prepareStatement(UPDATE_EMPLOYEE);
		    ps.setInt(1, employee.getSalary());
		    ps.setInt(2, empId);
		    
		    int row= ps.executeUpdate();
		    if(row>0)
		    {
		    	emp=findEmployeeById(empId);
		    }
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
		
	}
	
	public Employee findEmployeeById(int empId)
	{
		Employee emp =new Employee();
		String Find_By_Id= "select * from employdee where empId=?";
		try {
			PreparedStatement ps= MyConnection.getMyConnection().prepareStatement(Find_By_Id);
			ps.setInt(1, empId);
			ResultSet set = ps.executeQuery();
			while(set.next())
			{
				emp = new Employee(set.getInt("empid"), set.getInt("sal"), set.getString("name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return emp;
	}
	
	
	
}
