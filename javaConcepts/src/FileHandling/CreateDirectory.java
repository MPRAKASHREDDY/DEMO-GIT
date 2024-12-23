package FileHandling;

import java.io.File;

public class CreateDirectory {

	public static void main(String[] args) {
		String path="C:\\FileHandling\\java";
		File file=new File(path);
		file.mkdir();

	}

}
