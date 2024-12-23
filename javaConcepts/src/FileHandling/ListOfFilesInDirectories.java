package FileHandling;

import java.io.File;

public class ListOfFilesInDirectories {

	public static void main(String[] args) {
		
		String path="C:\\FileHandling";
		File file=new File(path);
		
		String[] myFiles=file.list();
		
		for(String myFile: myFiles)
		{
			System.out.println(myFile);
		}

	}

}
