package com.hackerrank.datastructure.arrays;

import java.util.Arrays;

public class ReturnArray {

	public static void main(String[] args) {

		int n = 15;

		int ar [] = count(n);
		
		for (int i = 0; i < ar.length; i++) {
			
			System.out.print(ar[i]+" ");
			
		}
	}

	private static int [] count(int n) {

		String str = Integer.toBinaryString(n);

		int count = 0;
		int index = 1;
		int ar [] = new int [10];

		for (int i = 0; i < str.length(); i++) {

			if(str.charAt(i) == '1') {

				count++;
				ar[index] = i;
				index++;
			}

		}
		
		ar[0] = count;
		
		int[] new_ar = Arrays.copyOfRange(ar, 0, index);
		
		return new_ar;


	}

}
