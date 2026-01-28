package org.tnsif.accenture.java.interfacedemo;


public class MarkerInterfaceDemo {
	public static void main(String[] args) {
		Registerable s=new Student(102,"neha",12000.3,"java");
		Registerable s1=new Student(103,"ramu",13000,"java");
		Object obj=new Object();
		if(obj instanceof Registerable)
		{
			System.out.println("Student is registered for this course");
		}
		else
		{
			System.out.println("Student is not registered for this course");
		}
	}

}
