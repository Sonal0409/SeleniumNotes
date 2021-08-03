package javaPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions2 {

	// throw keyword
	// for user defined  customized exceptions we use throw keyword
	
	
	public void driving(int age )
	{
		
		//code will be written
	if(age <18)
	{
		
		// syntax : throw new Exceptionname("message")    of a throw keyword
		throw new ArithmeticException("age is less than 18");
		
	}
	else
	{
		System.out.println("Age is right");

}
	}
	
	// throws() keyword
	
	
	public void waittime() throws InterruptedException 
	{
		Thread.sleep(3000);
	}
	
	public void readfile() throws FileNotFoundException 
	{
		FileInputStream f= new FileInputStream("C:\\Users\\vishal mittal\\Desktop\\text.txt");
	}
	
	
	
	
	public static void main(String[] args) throws InterruptedException 

	{
	Exceptions2 obj= new 	Exceptions2();
	
	
	obj.driving(15);
	
	
  obj.waittime();
	
   try {
	obj.readfile();
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}		
		
		
		
	}

}
