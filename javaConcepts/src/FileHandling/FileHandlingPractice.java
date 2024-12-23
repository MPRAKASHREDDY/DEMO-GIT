package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandlingPractice {
	public static void main(String[] args) throws IOException {
		String path=new String("C:\\FileHandling\\Prakash");
		File file=new File(path);
//		System.out.println(file.canRead());
//		System.out.println(file.canWrite());
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.getAbsoluteFile());
//		System.out.println(file.getParent());
		file.delete();
		

	}

}
