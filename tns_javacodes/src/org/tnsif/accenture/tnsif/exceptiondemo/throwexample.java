package org.tnsif.accenture.tnsif.exceptiondemo;

public class throwexample {
	public static void main(String[] args) {
		int age =25;
		
		if(age>18)
		{
			throw new ArithmeticException("you are eligible");
		}
		else
		{
			System.out.println("Not eligible");
		}
	}

}
