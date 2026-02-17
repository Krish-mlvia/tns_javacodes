package org.tnsif.accenture.c2tc.exceptiondemo;

public class StringIndexOutBoundException {
	public static void main(String[] args) {
		String str="hello";
		try
		{
			char ch=str.charAt(5);
			System.out.println(ch);
		}catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
			
		}
		finally
		{
			System.out.println("Thank you");
		}
		
		

	}

}
