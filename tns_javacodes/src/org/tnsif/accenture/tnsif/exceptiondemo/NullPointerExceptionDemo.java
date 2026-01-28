package org.tnsif.accenture.tnsif.exceptiondemo;

public class NullPointerExceptionDemo {
	public static void main(String[] args) {
		String words=null;
		try {
			System.out.println(words.length());
		}catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("No matterwhat this block will get executed");
		}
		
	}

}
