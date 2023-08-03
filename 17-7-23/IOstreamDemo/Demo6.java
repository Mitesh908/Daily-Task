package jj;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class demo6 {
public static void main(String[] args) throws Exception {
	Employee e1 = new Employee(101,"ajay Saxena" , 25000 , LocalDate.of(2000,10,30));
	
	
	FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\AmGupta\\Desktop\\demoNew7.txt");
	ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
	
	objectOutputStream.writeObject(e1);
	
	objectOutputStream.close();
	fileOutputStream.close();
	
}
}
