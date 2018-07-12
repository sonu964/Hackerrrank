package com.hackerrank.datastructure.arrays;

import java.util.Set;
import java.util.TreeSet;

public class CountPairsOfDistinctSum {


	public static void main(String[] args) { 
		int []a = {2,4,7,3,5,6,-5,-2,1,8,9,5,1,9};
		sumPairs(a,10);  
	}

	public static void sumPairs(int []input, int k){

		int n = input.length;

		for (int i = 0; i < n; i++) {

			for (int j = i+1; j < n; ) {

				if(input[i]==input[j]) {

					for (int p = j; p < n-1; p++) {

						input[p] = input[p+1];
					}

					n--;

				}else {

					j++;
				}

			}

		}
		int count = 0;
		Set<Integer> set = new TreeSet<Integer>();    
		for(int i=0;i<n;i++){

			if(set.contains(input[i])) {
				System.out.println(input[i] +", "+(k-input[i]));
				count++;
			}
			else
				set.add(k-input[i]);
		}
		System.out.println(count);
	}
}
