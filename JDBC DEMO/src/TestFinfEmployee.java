import java.util.List;

import com.pojos.Employee;

public class TestFinfEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDAO dao= new EmployeeDAO();
		List<Employee> emps= dao.findAllEmployees();
		for(Employee employee:emps)
		{
			System.out.println(employee.getEmpId()+"  "+employee.getName()+"  "+employee.getSalary());
		}

	}

}
