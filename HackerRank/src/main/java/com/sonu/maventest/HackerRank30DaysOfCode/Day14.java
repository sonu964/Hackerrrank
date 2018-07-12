package com.sonu.maventest.HackerRank30DaysOfCode;

import java.util.Scanner;


public class Day14 {


	private int[] elements;
	public int maximumDifference;

	// Add your code here

	Day14(int [] elements){

		this.elements = elements;

	}
	void computeDifference(){
		int max = 0;

		for(int i = 0; i < elements.length-1; i++){
			for(int j = 0; j<elements.length; j++){

				int diff =  Math.abs(elements[i] - elements[j]);
				if(diff > max) max = diff;
			}

		}

		maximumDifference = max;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Day14 difference = new Day14(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}// End of Day14 class