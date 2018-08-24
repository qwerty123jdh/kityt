package com.demo;

public class DemoLambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyInterface1 m= (x,y)-> {System.out.println("addition:-"+(x+y));};
		m.add(12, 70);
	}

}
