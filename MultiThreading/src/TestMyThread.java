
public class TestMyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main started"+Thread.currentThread().getName());
		Thread t= new MyThread();
		t.start();
		
		Thread t1= new MyThread();
		t1.start();
		
		
		Thread t2= new MyThread();
		t2.start();
		System.out.println("main completed"+Thread.currentThread().getName());
	}

}
