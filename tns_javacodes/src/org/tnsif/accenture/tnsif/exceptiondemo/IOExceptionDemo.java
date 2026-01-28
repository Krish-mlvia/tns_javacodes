package org.tnsif.accenture.tnsif.exceptiondemo;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class IOExceptionDemo {
	public static void main(String[] args) throws Exception
	{
		try
		{
			BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\hemav\\OneDrive\\Desktop\\Java training Notes\\demo.txt"));
			String data ="";
			while((data=br.readLine())!=null) {
				System.out.println(data);
			}
	      
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}

}
