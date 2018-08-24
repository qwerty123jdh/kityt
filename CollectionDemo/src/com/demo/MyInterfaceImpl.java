package com.demo;

public class MyInterfaceImpl implements MyInterface {

	@Override
	public void showData() {
		// TODO Auto-generated method stub
		System.out.println("showing data from implementation class");

	}

	public static void main(String[] args)
	{
		MyInterfaceImpl m= new MyInterfaceImpl();
		m.showData();
	}
	
}
