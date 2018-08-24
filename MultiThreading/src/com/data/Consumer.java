package com.data;

public class Consumer implements Runnable {
	private Message msg;
	public Consumer(Message m) {
		this.msg=m;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name= Thread.currentThread().getName();
		synchronized (msg) {
		try {
			System.out.println(name+" waiting to get notified at time:"+ System.currentTimeMillis());
			msg.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name+" consumer thread got notified at time: "+ System.currentTimeMillis());
		System.out.println(name+" processed: "+msg.getMsg());
		}

	}

}
