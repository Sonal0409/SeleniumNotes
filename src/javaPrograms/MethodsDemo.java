package javaPrograms;

public class MethodsDemo {

public static int x=100;
	
	public static int sum()
	{
		int a=10;  // local variable
		int b=20;
		int c=a+b;
		return c;
		
	}
	
	public void method2()
	{
		System.out.println(x);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemo obj = new MethodsDemo();
		
		sum();
	
		
		
	}

}
