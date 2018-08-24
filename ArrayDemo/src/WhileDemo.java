
public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] array= {12,34,44,54,64,55,65};

 int i=0;
while(i<array.length) {
	System.out.println(array[i]);
	i++;
}

i=0;
boolean flag;
 int search =54;
 while(i<array.length) {
	 if (array[i]==54)
		 flag=true;
	 i++;
 }
 
 if(flag=false) {
	 System.out.println("value found");
 }
 else
	 System.out.println("notfound");
	}

}
