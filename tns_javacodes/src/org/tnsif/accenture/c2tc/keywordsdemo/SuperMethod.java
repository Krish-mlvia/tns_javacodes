package org.tnsif.accenture.c2tc.keywordsdemo;

class Animal5
{
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
}
class Dog5 extends Animal5
{
	void makeSound()
	{
		super.makeSound();
		{
			System.out.println("Dogs barks");
		}
		
	}
}

public class SuperMethod {
	public static void main(String[] args) {
		Dog5 obj=new Dog5();
		obj.makeSound();
	}

}
