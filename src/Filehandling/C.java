package Filehandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class C {

	public static void main(String[] args) throws IOException {
		File f1=new File("D://Chetan/Sample5."
				+ ".3");
		if(!f1.exists()) {
			f1.createNewFile();
			System.out.println("File created");
		}
		else {
			System.out.println("file not created");
		}
		FileOutputStream fos=new FileOutputStream(f1);
		String msg="chetanTYSS";
		fos.write(msg.getBytes());
	
	FileInputStream fis=new FileInputStream(f1);
	int i=fis.read();
	while(i!=-1) {
		System.out.print((char)i);
		i=fis.read();
	}
	fis.close();
	

}}
