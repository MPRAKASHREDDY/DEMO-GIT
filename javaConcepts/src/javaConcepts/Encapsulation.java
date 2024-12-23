package javaConcepts;

class Customer{
	private String name;
	private String password;
	public Customer(String name,String password)
	{
		this.name=name;
		this.password=password;
	}
	public String name()
	{
		return name;
	}
	public String password()
	{
		return password;
	}
	
}
public class Encapsulation {
	public static void main(String[] args) {
		Customer c=new Customer("prakash","prakash123");
		System.out.println(c.name());
		System.out.println(c.password());
		
		

	}

}
