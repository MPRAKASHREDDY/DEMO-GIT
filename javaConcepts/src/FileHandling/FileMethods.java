package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMethods 
{

	public static void main(String[] args) throws IOException 
	{

	     String path="C:\\FileHandling\\abc.txt";
	     File file=new File(path);
//	     System.out.println(file.exists());
//	     System.out.println(file.canRead());
//	     System.out.println(file.canWrite());
//	     System.out.println(file.getName());
//	     System.out.println(file.getParent());
//	     System.out.println(file.getAbsolutePath());
	     System.out.println(file.isFile());
	     System.out.println(file.isDirectory());
	      
	}
	      


}
