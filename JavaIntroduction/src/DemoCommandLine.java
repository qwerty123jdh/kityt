
public class DemoCommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("num of arguments:-"+args.length);
//System.out.println("argument:-"+args[0]);
int sum =0;
  for(String arg:args) {
	   sum=sum+Integer.parseInt(arg);
	   System.out.println(sum);
  }
	}

}