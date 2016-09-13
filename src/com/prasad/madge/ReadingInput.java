package com.prasad.madge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingInput {

	public static void main(String[] args) {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s;
		try {
			System.out.println("Enter the line:");
			s = r.readLine();
			System.out.println("the entered line is "+s);
			
			System.out.println("reading integer");
			System.out.println("enter the integer :");
			s = r.readLine();
			int i = Integer.parseInt(s);
			System.out.println("the new integer is :"+(i+8));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
