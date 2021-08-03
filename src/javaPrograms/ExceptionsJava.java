package javaPrograms;

public class ExceptionsJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// handle exceptions using try and catch block
		// the lines of code in the try block will be ignored
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
		
	// Sceanrio 2
		// in this case, try block will give an exception and 
		//than finally block will be executed and than the program will terminate
		try
		{
		int a=25/0;
		System.out.println(a);// exception 
		}
		finally
		{
			System.out.println("executing finally block with try block");
		}
		
		
		
		
		
		try
		{
		String s=null;
		
		System.out.println(s.length());  // Nullpointer exception
		}
		catch(NullPointerException x)
		{
			//int a=25/10;
			//System.out.println(a);
			x.printStackTrace();
			//System.out.println("Handling NullPointerException exception");
		}
		
		// in Java we can convert a string into an integer, provided the string is series of digits
		// string s="123";
		
		String s1="123";
		
		// convert string into an integer
		
		int x=Integer.parseInt(s1);
		

		System.out.println(x);
		
		
		 try
		  {
		   int [] arrSum= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		   
		  // for(int i=0;i<arrSum.length;i++)
			//   i=13 ; 
		   for(int i=arrSum.length;i>0;i--)
		   {
		          System.out.println("Print numbers of a array:"+ arrSum[i]);
		         }   
		  }
		  catch(ArrayIndexOutOfBoundsException e)
		  {
		   e.printStackTrace();
		   System.out.println("Handling ArrayIndexOutOfBoundsException");
		  } 
		

		System.out.println("learning exceptions");
	}

}
