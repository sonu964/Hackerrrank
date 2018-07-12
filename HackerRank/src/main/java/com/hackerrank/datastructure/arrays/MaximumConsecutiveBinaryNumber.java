package com.hackerrank.datastructure.arrays;

import java.util.Scanner;

public class MaximumConsecutiveBinaryNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = 15;
		//String [] ones = Integer.toBinaryString(n).split("[0]+");
		
		String str = "";
		
		while(n>0) {
			
			int r = n % 2;
			str = r + str;
			n = n/2;
			
		}
		
		String ones [] = str.split("[0]+");
		
		int max = 0;
		
		for(String one : ones) {
			
			if(one.length()>max) max = one.length();
		}
		
		System.out.println(max);

	}

}
