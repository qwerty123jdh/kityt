package com.exceptions;

import java.io.PrintStream;

public class MyException extends Exception {
	
	private String message;
	public MyException()
	{
		message="you got XXX exception";
	}

	
	public MyException(String message) {
		super(message);
		this.message = message;
	}


	public void showCause() 
	{
		System.out.println("you got XXX exception");
	}
	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		super.printStackTrace();
		System.out.println("this is my message");
	}
}
