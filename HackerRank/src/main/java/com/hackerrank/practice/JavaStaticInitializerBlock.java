package com.hackerrank.practice;

import java.util.Scanner;
import java.util.*;


public class JavaStaticInitializerBlock {

	//Write your code here

	private static Scanner scan = new Scanner(System.in);
	static int B = 0;
	static int H = 0;
	static boolean flag = true;
	static
	{
		B = scan.nextInt();
		H = scan.nextInt();
		if(B<=0 || H<=0)
		{

			System.out.print("java.lang.Exception: Breadth and height must be positive");
			flag = false;
		}
	}
	public static void main(String[] args){
		
		TreeSet<Integer> s = new TreeSet<Integer>();
		TreeMap<Integer, String> m = new TreeMap<Integer, String>();
		
		if(flag){
			int area=B*H;
			System.out.print(area);
		}

	}//end of main

}//end of class
