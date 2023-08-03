package jj;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.FileOutputStream;
public class Demo2 {
	public static void main(String[] args) {
	/*
	{
		
		FileInputStream fin = new FileInputStream("C:\\Users\\AmGupta\\Desktop\\demo.txt");
		int ch ; 
	
		while((ch=fin.read())!=-1)
			System.out.println((char)ch);
		fin.close();
	}
	*/
	try {
		
	FileOutputStream fos = null  ;
	fos = new FileOutputStream("c:\\" , true);
	for(int i=65 ; i<=90 ; i++)
		fos.write(i);
	fos.close();
	}
	catch(IOException ex) {
		System.out.println(ex);
	}
	// if you want to see the remaing content and previous should also be there then you should use "true"
			
}}
