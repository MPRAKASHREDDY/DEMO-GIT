package javaConcepts;

class Demoo extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try {
				System.out.println(i);
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
}
class Demoo1 extends Thread{
	public void run()
	{
		for(;;)
		{
			try {
				System.out.println("Deaman thread");
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
public class Threads {

	public static void main(String[] args) {
		
		Demoo d=new Demoo();
		Demoo1 d1=new Demoo1();
		d1.setDaemon(true);
		d.start();
		d1.start();
		
		
	}

}
