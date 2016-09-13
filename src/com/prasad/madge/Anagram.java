package com.prasad.madge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		try{
			BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter first string :");
			String s1 = r.readLine();
			System.out.println("Enter second string :");
			String s2 = r.readLine();
			
			boolean isAnagram = checkAnagram(s1,s2);
			
			System.out.println("Strings are "+isAnagram +"anagram");
		}catch(Exception e){
			System.out.println("error "+e);
		}
	}

	public static boolean checkAnagram(String s1 , String s2){
		
		char [] c1 = s1.toCharArray();
		char []  c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return Arrays.equals(c1, c2);
		
	}
	
}
