package org.tnsif.accenture.c2tc.keywordsdemo;

class MathUtils
{
	public static int square(int number)
	{
		return number * number;
	}
	public static int add(int a ,int b)
   {
		return a+b;
	}
}

public class StaticMethodDemo {
	public static void main(String[] args) {
		int result1 = MathUtils.square(5);
		int result2 = MathUtils.add(2,3);
		System.out.println(result1);
		System.out.println(result2);
	}

}
