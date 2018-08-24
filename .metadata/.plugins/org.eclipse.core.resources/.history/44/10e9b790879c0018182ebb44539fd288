package com.executors;

import java.util.concurrent.ExecutorService;

public class myapp implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		perform();
	}

	void perform() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello\t"+i+"\t"+Thread.currentThread());
			try {
				Thread.sleep(100);
			} catch (InterruptedException ie) {
				// TODO Auto-generated catch block
				System.out.println(ie);
			}
		}
	}
}


