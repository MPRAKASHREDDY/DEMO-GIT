package javaConcepts;

class plane{
	public void fly()
	{
		System.out.println("plane is flying");
	}
	
}
class cargoPlane extends plane{
	public void carry()
	{
		System.out.println("cargoPlane is carring cargo");
	}
}
public class Inheritance {
	public static void main(String[] args) {
		cargoPlane c=new cargoPlane();
		c.fly();
		c.carry();
	}
}
