package javaPrograms;

public class ChildClass extends ParentClass {
	
	public void login()
	{
	
	System.out.println("search for email with name as :" + "sonal");
			
	System.out.println("search for email with name as :" + "mittal");	
	}
	
	public void composeemail()
	{
		System.out.println("Test compose of email");
	}

	public void searchemail(String inputvalue)
	{
		System.out.println("search for email with name as :" + inputvalue);
		
	}
	
	public void searchemail(int inputvalue)
	{
		System.out.println("search for email with number as :" + inputvalue);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass obj= new ChildClass();
		
	    obj.login();
	    
		obj.composeemail();
		obj.searchemail("sonal");
		obj.searchemail("edureka");
		obj.searchemail(1234);
		obj.logut();

		
	}

}
