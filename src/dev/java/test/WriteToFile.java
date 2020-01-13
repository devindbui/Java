package dev.java.test;

import java.io.PrintStream;
import java.io.IOException;
import java.io.File;

public class WriteToFile {
	public static void main(String[] args) {
		try {
			PrintStream ps = new PrintStream(new File("C:\\Users\\Devin\\git\\Java\\src\\dev\\java\\interview\\Write2File.txt") );
			ps.println("Happy");
			System.out.println("File written successfully");
		}catch(IOException e){	
			System.out.println("An error occured while trying to write to the file");
		}
		
	}
	
	
}
