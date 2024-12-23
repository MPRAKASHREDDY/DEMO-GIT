package javaConcepts;

class A{
	public void run()
	{
		System.out.println("A class");
	}
}
class B extends A{
	public void run()
	{
		System.out.println("B class");
	}
}
public class snippets {

	public static void main(String[] args) {
		A a=new A();
		a.run();
		A b=new B();
		b.run();
	}

}
