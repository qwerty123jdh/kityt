package com.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestAnnotation1 {
	
	@MyDate(day=23,month="July",year=2018)

	public static void display()
	{
		System.out.println("display");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestAnnotation1 test = new TestAnnotation1();
		Class class1= test.getClass();
		Method[] method= class1.getMethods();
		
		for(Method methods: method) {
			Annotation[] annotations= methods.getAnnotations();
			for(Annotation anno: annotations) {
				if(anno.annotationType().equals(MyDate.class))
				{
					MyDate m= (MyDate)anno;
					int day=m.day();
					String month=m.month();
					int year= m.year();
					System.out.println(day+"/"+month+"/"+year);
				}
			}
			
		}

	}

}
