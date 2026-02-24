package org.tnsif.accenture.c2tc.keywordsdemo;

class Animal6
{
	String name="Animal";
}

class Dog6 extends Animal6
{
	String name="Dog";
	
	void displayName()
	{
		System.out.println("Superclass name : " +super.name);
		System.out.println("Subclass name : " +name);
	}
}

public class SuperField {
	public static void main(String[] args) {
		Dog6 obj=new Dog6();
		obj.displayName();
		

	}

}
