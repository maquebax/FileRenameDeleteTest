import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

public class FileHandler extends Thread {
File file;
FileMode  mode;

FileHandler(File infile, FileMode infileMode){
	file = infile;
	mode = infileMode;
 }
	
public void run() {
	switch(mode) {
	case READ :  readFile();break;
	case WRITE : writeFile();break;
	default:
		break;
	
	}
}

private void writeFile() {
	// TODO Auto-generated method stub
	try(DataOutputStream dataOS =  new DataOutputStream(new FileOutputStream(this.file))){
		for(int i =0 ; i< 5 ; i++) {
		dataOS.writeUTF("FIle writing test "+i);
		Thread.sleep(1000);
		}
		System.out.println("WriteComplete");
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}

private void readFile() {
	// TODO Auto-generated method stub
	try (BufferedReader br = new BufferedReader(new FileReader(this.file))){
		while(br.readLine()!=null) {
			Thread.sleep(1000);
		}
		System.out.println("ReadComplete");
	}catch(Exception e) {
		e.printStackTrace();
	}
}
	
}
