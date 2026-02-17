package org.tnsif.accenture.c2tc.keywordsdemo;

public class StaticVar {
	String name;
	double price;
	static String category="Smart Phone";
	
	StaticVar(String name , double price)
	{
		this.name=name;
		this.price=price;
	}

	public void displaydetails()
	{
		System.out.println("Name :" + name);
		System.out.println("Price:" + price);
		System.out.println("Category :" + category);
	}
	public static void main(String[] args) {
		StaticVar obj=new StaticVar("Redmi",40000);
		StaticVar obj1=new StaticVar("Iphone",80000);
		obj.displaydetails();
		obj1.displaydetails();
	}

}
