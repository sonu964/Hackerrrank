package com.hackerrank.datastructure.arrays;

import java.util.Scanner;

public class CountSetBits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = 7;


		int count = 0;

		while(n>0) {

			count += n&1;
			n >>=1;

		}
		System.out.println(count);
		
		sc.close();
	}
}
