package javaPrograms;

public class Exceptions3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// finally  block
				try
				{
				int a=25/0;
				System.out.println(a);// exception 
				}
			
				// finally block will get executed even if exception occurs or it doesnot occur
				// you can write it with try block or with try and catch blcok
				
				finally
				{
					// code realted to closing a file, closing an application, closing DB
					System.out.println("executing finally block");
				}
				
				
				System.out.println("Hello world");
				
				// finally  block again with try and catch
				
				try
				{
				int a=25/0;
				System.out.println(a);// exception 
				}
			
				catch(ArithmeticException x)
				{
					//int a=25/10;
					//System.out.println(a);
					x.printStackTrace();
					//System.out.println("Handling arithmetic exception");
				}
				// finally block will get executed even if exception occurs or it doesnot occur
				// you can write it with try block or with try and catch blcok
				
				finally
				{
					System.out.println("executing finally block");
				}
	}

}
