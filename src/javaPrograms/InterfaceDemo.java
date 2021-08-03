package javaPrograms;

public interface InterfaceDemo {


	public void login();
	public void homeloans();
	public void creditcard();
	
    default public void displayCustomerName(String Name)
    {
    	System.out.println("the name is: "+ Name);
    }

}
