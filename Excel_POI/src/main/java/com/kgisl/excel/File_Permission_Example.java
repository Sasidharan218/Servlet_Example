package com.kgisl.excel;

import java.io.File;
import java.io.IOException;

public class File_Permission_Example {
	public static void main(String[] args) {
		try {

			File file = new File("C://Users/krishnan.u/Desktop/Krishnanjava/files12.txt");
			file.setReadable(true);
			file.setExecutable(true);
			file.setExecutable(true);

			if (file.exists()) {
				System.out.println("Is Execute allow : " + file.canExecute());
				System.out.println("Is Write allow : " + file.canWrite());
				System.out.println("Is Read allow : " + file.canRead());
			}

			file.setExecutable(false);
			file.setReadable(false);
			file.setWritable(false);

			System.out.println("Is Execute allow : " + file.canExecute());
			System.out.println("Is Write allow : " + file.canWrite());
			System.out.println("Is Read allow : " + file.canRead());

			if (file.createNewFile()) {
				System.out.println("File is created!");
			} else {
				System.out.println("File already exists.");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}