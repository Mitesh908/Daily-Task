package jj;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
public class demo4 {
	public static void main(String[] args) {
		DataOutputStream dos = null ; 
		FileOutputStream fos = null ; 
		
		int i = 99999;
		long l = 99999999;
		float f = 12356.54F ; 
		double d = 12345345.00;
		try {
			fos = new FileOutputStream("C:\\\\Users\\\\AmGupta\\\\Desktop\\\\abc.txt");
			dos = new DataOutputStream(fos) ;
			dos.writeInt(i);
			dos.writeLong(l);
			dos.writeFloat(f);
			dos.writeDouble(d);
			dos.close();
			fos.close();
			
		}
		catch(IOException ex) {
			System.out.println(ex);
		}
	}

}
