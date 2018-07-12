package com.hackerrank.java;

import java.util.Scanner;

public class JavaStringTokens {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// Write your code here.
		String [] str = s.trim().split("[ !,'._?@]+");
		System.out.println(str.length);
		if(str.length >= 1 && str.length <= 400000){

			for(String res : str){

				System.out.println(res);
			}
		}
		scan.close();
		
		
	}
}
