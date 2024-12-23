package javaConcepts;

interface class1{
	void fly();
	
}
class Demo implements class1{
	public void fly()
	{
		System.out.println("flying5");
	}
}

public class Interface1 {
	public static void main(String[] args) {
		
//		class1 c=new Demo1();
//		c.fly();
		Demo d=new Demo();
		d.fly();
		
		
		

	}

}
