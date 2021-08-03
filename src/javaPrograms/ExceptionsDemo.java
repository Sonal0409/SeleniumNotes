package javaPrograms;

public class ExceptionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	int a=25/0;
		System.out.println("the value of a is:" + a);*/
		try {
		String s= null;
		System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			
			System.out.println("handaling execption");
		}
		finally
		{
			System.out.println("this is final block");
		}
		
		System.out.println(10+20);
		System.out.println("hello All");
		
	}

}
