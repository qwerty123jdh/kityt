
public class TestMyThread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main started"+Thread.currentThread().getName());
		Thread t= new MyThread1();
		t.setName("no data");
		t.start();
		
		
		Thread t1= new MyThread1(32);
		t1.setName("short data");
		t1.start();
		
		Thread t2= new MyThread1(874);
		t2.setName("bada data");
		t2.start();
		System.out.println("main completed"+Thread.currentThread().getName());
	}

}
