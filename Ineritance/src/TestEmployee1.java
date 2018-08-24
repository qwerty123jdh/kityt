import java.util.Scanner;

import com.pojo.Employee;
import com.pojo.Person;

public class TestEmployee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //Scanner d= new Scanner(System.in);
 //System.out.println("Enter the age");
 //int age1=d.nextInt();
 //System.out.println("Enter the name of Employee");
 //String name1=d.next();
 //System.out.println("enter the salary");
 //double salary1=d.nextDouble();
// System.out.println("enter the employeeid");
 //int empid1= d.nextInt();
 
 //Employee emp= new Employee(empid1,salary1,age1,name1);
	//emp.display();
		
		Person p1=new Person(20, "ABC");
		Person p2=new Person(20, "ABC");
		if(p1.equals(p2)) {
			System.out.println("both are eual");
		}
		else {
			System.out.println("not equal");
		}
			
		
		
	}

}
