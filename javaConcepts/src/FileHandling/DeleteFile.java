package FileHandling;
import java.io.File;
public class DeleteFile {
	public static void main(String[] args) {
		String path="C:\\FileHandling\\ccc.txt";
		File file=new File(path);
		file.delete();
	}
}
