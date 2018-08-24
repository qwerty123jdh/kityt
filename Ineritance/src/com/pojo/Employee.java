package com.pojo;

public class Employee extends Person {
	private double empsalary;
	private int empid;
	public Employee() {
		super();
		empid=0;
		empsalary=1000;
	}

	  public Employee(int empid, double empsalary, int age, String name) {
		  super(age,name);
		  this.empid=empid;
		  this.empsalary=empsalary;
	  }

	public double getEmpsalary() {
		return empsalary;
	}

	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}
	  
	public void display(int x)
	{
		super.display();
		System.out.println(empid+"\t"+empsalary);
	 System.out.println("name="+getName());
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ " "+empid+ "  "+ empsalary;
	}
}
