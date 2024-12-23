package FileHandling;

import java.io.File;
import java.io.IOException;
public class CreateFiles {
	public static void main(String[] args) {
		String path="C:\\FileHandling\\ccc.txt";
		File file=new File(path);
		try {
			file.createNewFile();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
