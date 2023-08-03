package jj;

import java.io.File;

public class Demo {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\AmGupta\\Desktop\\demo.txt");
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.length());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.canExecute());
	}
}
