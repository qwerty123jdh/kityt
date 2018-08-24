package com.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestPerform {
	
	
	int sum=0;

	@PerformOperation(number1=43)
	public int sumof(int number1, int number2) {
		sum= number1+number2;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestPerform t= new TestPerform();
		Class class1= t.getClass();
		Method[] method= class1.getMethods();
		for(Method methods: method) {
			Annotation[] annotation= methods.getAnnotations();
			for(Annotation anno:annotation) {
				
				if(anno.annotationType().equals(PerformOperation.class))
				{
					PerformOperation p=  (PerformOperation)anno;
					int no=p.number1();
					int no1=p.number2();
					System.out.println(t.sumof(no,no1));
				}
			}
		}
		

	}

}
