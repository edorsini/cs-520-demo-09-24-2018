import java.io.File;

public class RenameFileJavaDemo {
	public static void main(String[] args) {
		// Old File
		File oldfile = new File("cs520file.txt");
		// New File
		File newfile = new File("mynewfile.txt");
		/*
		 * renameTo() return boolean value It return true if rename operation is
		 * successful
		 */
		boolean flag = oldfile.renameTo(newfile);
		if (flag) {
			System.out.println("File renamed successfully");
		} else {
			System.out.println("Rename operation failed");
		}
	}
}