import java.io.File;

public class OpenFileTest {
	
	public static void main(String[] args) {
	//	openFileReadDeleteTest();
    //openFileWriteDeleteTest();
	openFileReadRenameTest();
	//openFileWriteRenameTest();
	}

	private static void openFileWriteRenameTest() {
		File file = new File("WriteTest.txt");
		File target = new File("WriteRenamedTest.txt");
		FileHandler fileHandler = new FileHandler(file, FileMode.WRITE);
		fileHandler.start();
		System.out.println("Rename File while Writing :"+file.renameTo(target));
		
	}

	private static void openFileWriteDeleteTest() {
		File file = new File("WriteTest.txt");
		FileHandler fileHandler = new FileHandler(file, FileMode.WRITE);
		fileHandler.start();
		System.out.println("Delete File while Writing :"+file.delete());
		
	}

	private static void openFileReadRenameTest() {
		File file = new File("ReadTest.txt");
		File target = new File("ReadRenamedTest.txt");
		FileHandler fileHandler = new FileHandler(file, FileMode.READ);
		fileHandler.start();
		System.out.println("Rename File while Reading :"+file.renameTo(target));
		
	}

	private static void openFileReadDeleteTest() {
		File file = new File("ReadTest.txt");
		FileHandler fileHandler = new FileHandler(file, FileMode.READ);
		fileHandler.start();
		System.out.println("Delete File while Reading :"+file.delete());
	}
	
}
