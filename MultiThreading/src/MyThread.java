
public class MyThread extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread started:"+Thread.currentThread().getName());
		System.out.println("Hello");
	}

}

