package com.pojo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s= new Student();
		s.display();
		
		Scanner t= new Scanner(System.in);
		
			System.out.println("please enter name");
		String name2= t.next();
		System.out.println("enter the elements of array");
		int [] marks2= new int [5];
		for(int x=0; x<5;x++) {
			marks2[x]= t.nextInt();
		}
		System.out.println("enter rollno");
		int roll= t.nextInt();
		Student y=new Student(name2,marks2,roll);
		y.display();
		

	}

}
