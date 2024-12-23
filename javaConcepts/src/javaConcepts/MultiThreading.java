package javaConcepts;

class Demo11 extends Thread{
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
class Demo2 extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try {
				System.out.println((char)(65+i));
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
public class MultiThreading {
	public static void main(String[] args) {
		Demo11 d1=new Demo11();
		Demo2 d2=new Demo2();
		d1.start();
		d2.start();

	}

}
