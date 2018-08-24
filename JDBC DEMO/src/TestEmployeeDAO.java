import java.util.Scanner;

import com.pojos.Employee;

public class TestEmployeeDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter employee id");
		int x=s.nextInt();
		System.out.println("enter employee name");
		String n= s.next();
		System.out.println("enter employee salary");
		int sal= s.nextInt();
		Employee myEmployee= new Employee(x, sal, n);
		Employee empadd= new Employee();
		EmployeeDAO dao= new EmployeeDAO();
		int rows1=dao.addEmployee(empadd);
		int rows= dao.addEmployee(myEmployee);
		
		if(rows>0)
		{
			System.out.println("recored inserted successfully");
		}
		else
			System.out.println("sorry");

	}

}
