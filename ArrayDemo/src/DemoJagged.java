
public class DemoJagged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] [] values=new int[3][];
values[0]= new int[4];
values[0][0]= 123;
values[0][1]= 124;
values[0][2]= 125;

values[1]=new int[2];
values[1][0]= 223;
values[1][1]= 224;

values[2]=new int[5];
values[2][0]= 333;
values[2][1]= 334;
values[2][2]= 335;

for(int [] arr:values)
{
	for(int v:arr) {
		System.out.print(v+"\t");
	}
	System.out.println();
}

	}

}
