package com.pojo;

 public class Person {
	
	private int age;
	private String name;
	
	public void display() {
		System.out.println("name:-"+name+"\t"+"age:-"+age);
	}
public Person() {
	age=22;
	name="Rashmi";
}

public Person(int age, String name) {	
	this.age=age;
	this.name=name;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int a) {
	age=a;
}
@Override
public String toString() {
	return "Person [age=" + age + ", name=" + name + "]";
}
 @Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	 Person p= (Person) obj;
	return (p.name.equals(name) && p.age==this.age);
}
}
