package org.tnsif.accenture.tnsif.exceptiondemo;

public class ArrayIndexOutOfBoundExceptionDemo {
	public static void main(String[] args) {
		int arr[]=new int[4]; //1 2 3 4 start=0 end=3
		try
		{
			 int i=arr[6];
			 System.out.println(i);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
	}

}
