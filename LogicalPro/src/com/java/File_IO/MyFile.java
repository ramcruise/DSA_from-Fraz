package com.java.File_IO;

import java.io.File;
import java.io.IOException;

public class MyFile {

	public static void main(String[] args) throws IOException {
		File f = new File("E://cricket.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
//		f.mkdir();
//		System.out.println("dir got created");
	}

}
