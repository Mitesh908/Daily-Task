
package jj;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class Demo3 {
	public static void main(String[] args) {
		
	
	
	FileOutputStream fos = null;
	BufferedOutputStream bos = null;
	try {
		fos = new FileOutputStream("C:\\Users\\AmGupta\\Desktop\\abc.txt");
		bos = new BufferedOutputStream(fos,500);
		for(int i=65 ; i<=90;i++)
			bos.write(i);
		bos.close();
		fos.close();
	}
	catch(IOException ex) {
		System.out.println(ex);
	}
}

}
