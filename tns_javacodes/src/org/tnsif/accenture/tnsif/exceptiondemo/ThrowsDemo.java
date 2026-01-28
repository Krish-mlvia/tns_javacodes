package org.tnsif.accenture.tnsif.exceptiondemo;
import java.io.IOException;

public class ThrowsDemo {
	//hema
		void m1()
		{
			System.out.println("No Exception");
		}
		//aman
		void m2() throws IOException
		{
			System.out.println("Device error");
		}
		//krish
		void m3() throws ArithmeticException , IOException,ClassNotFoundException
		{
			System.out.println("File not found");
		}
		
		
		public static void main(String[] args) {
			ThrowsDemo obj=new ThrowsDemo();
			
			obj.m1();
			
			try
			{
				obj.m2();
			}catch(IOException e)
			{
				System.out.println(e);
			}
			
			try {
				 obj.m3();
			}catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
			catch(ClassNotFoundException e)
			{
				System.err.println(e);
			}
			
		}

}
