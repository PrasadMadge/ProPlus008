package com.prasad.madge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) {
		File f = new File ("file1.properties");
		try {
			f.createNewFile();
			System.out.println("file creted");
			FileWriter fw = new FileWriter(f);
			fw.write("username=prasad\n");
			fw.write("surname=madge");
			fw.flush();
			fw.close();
			
			System.out.println("file reader");
			char [] in = new char[50];
			FileReader fr = new FileReader(f);
			int size=fr.read(in);
			
			System.out.println("file writer");
			for (char c: in){
				System.out.print(c);
			}
			fr.close();
			
			// buffer writer
			File f1 = new File("file2.txt");
			f1.createNewFile();
			fw = new FileWriter(f1);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("this is cool");
			bw.flush();
			bw.close();
			
			// bufferreader
			fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);
			String input = br.readLine();
			
			System.out.println("after reading "+input);
			
			//  make directory
			File f2 = new File("folder/folder1/folder2");
			f2.mkdir();
			
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
