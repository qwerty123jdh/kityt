
public class MyThread1 extends Thread {
	
	int data;
	public MyThread1()
	{
		
	}
	
	public MyThread1(int data)
	{
		this.data=data;
	}
	
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread started");
		System.out.println("data is: "+data+"   name is: "+Thread.currentThread().getName());
	}

}
