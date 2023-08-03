package jj;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo7 {
	public static void main(String[] args) throws Exception {
	FileInputStream fileInputStream = new FileInputStream("C:\\Users\\AmGupta\\Desktop\\demoNew7.txt");
	ObjectInputStream onInputStream = new ObjectInputStream(fileInputStream);
	
	Employee employee = (Employee) onInputStream.readObject();
	
	System.out.println(employee.getEmpid());
	System.out.println(employee.getEname());
	System.out.println(employee.getSalary());
	System.out.println(employee.getDob());
	//System.out.println(employee.getClass());
	
	onInputStream.close();
	fileInputStream.close();
	
	}
	
}

/*
FileInputStream fis = null ; 
	ObjectInputStream ois = null ; 
	
		try {
			fis = new FileInputStream("C:\\Users\\AmGupta\\Desktop\\d.txt");
			ois = new ObjectInputStream(fis);
			Employee e = (Employee)ois.readObject();
			System.out.println(e.getEmpid()+ " "+ e.getDob());
			ois.close();
			fis.close();
		}
		catch(IOException | ClassNotFoundException ex)
		{
			System.out.println(ex);
		}
*/
