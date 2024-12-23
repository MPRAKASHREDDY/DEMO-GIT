package javaConcepts;
import java.util.Scanner;
import java.util.TreeSet;
public class Exceptions {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number1");
		float a=scan.nextFloat();
		System.out.println("enter the number2");
		int b=scan.nextInt();	
//		try {
//			int c=(int)a/b;
//			System.out.println(c);
//			
//		}
//		catch(Exception e)
//		{
//			System.out.println("error");
//		}
		System.out.println(a/b);
	}

}
