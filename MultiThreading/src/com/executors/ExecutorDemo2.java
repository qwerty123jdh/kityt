package com.executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorDemo2 {
	 public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService exec= Executors.newFixedThreadPool(2);
		
		for(int i=12; i<15;i++) {
			Future<Integer> future= exec.submit(new MyApplication(i));
			System.out.println("After calculation:-"+future.get());
		}
		exec.shutdown();
	}
}