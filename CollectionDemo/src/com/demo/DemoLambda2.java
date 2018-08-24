package com.demo;

public class DemoLambda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyInterface2 m= (b1,b2) ->{return( b1.getIsbn()== b2.getIsbn());};
		System.out.println(m.add(new Book(12,"peieie","pidsd",2635d),(new Book(12,"ieu","pee",847d))));
	}

}
