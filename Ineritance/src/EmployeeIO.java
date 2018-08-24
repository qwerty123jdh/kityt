import com.pojo.Employee;

public interface EmployeeIO {
	double PI=3.14;
	public static final String name="CITI";
	
	Employee readEmployee();
	abstract public void writeEmployee(Employee employee);
	
	void display();
	default void description() {
		System.out.println("Hello");
	}
	
}
