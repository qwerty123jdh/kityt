import com.exceptions.MyException;

public class TestMyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=10;
		try {
		if(age<18)
		{
			throw new MyException("your age is not greater than 18");
		}

	} catch(MyException e) {
		e.printStackTrace();
	}

}
}
