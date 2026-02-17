package org.tnsif.accenture.c2tc.keywordsdemo;

class StaticBlockDemo
{
	public void display()
	{
		System.out.println("instance block-1");
	}
	static
	{
		System.out.println("static block-1");
	}
	static
	{
		System.out.println("static block-2");
	}
}

public class staticblock {
	public static void main(String[] args) {
		StaticBlockDemo obj=new StaticBlockDemo();
		obj.display();

	}

}
