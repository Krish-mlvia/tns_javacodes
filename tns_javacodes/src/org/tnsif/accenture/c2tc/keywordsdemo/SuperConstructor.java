package org.tnsif.accenture.c2tc.keywordsdemo;

class Animal7
{
	Animal7()
	{
		System.out.println("Animal constructor ");
	}
}
class Dog7  extends Animal7
{
	Dog7()
	{
		super();
		System.out.println("Dog constructor");
	}
}

public class SuperConstructor {
	public static void main(String[] args) {
		Dog7 dog=new Dog7();

	}

}
