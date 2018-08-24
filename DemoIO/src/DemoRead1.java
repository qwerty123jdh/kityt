import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoRead1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br1= new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("enter no1");
			String no1=br.readLine();
			int no= Integer.parseInt(no1);
		
			System.out.println("enter no2");
			String no2=br1.readLine();
			int no3= Integer.parseInt(no2);
			if(no>no3) {
				System.out.println("no1 is greater");
			}
			else
			{
				System.out.println("no2 is greater");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
