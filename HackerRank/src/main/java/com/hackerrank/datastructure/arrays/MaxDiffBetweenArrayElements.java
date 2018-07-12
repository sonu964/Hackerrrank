package com.hackerrank.datastructure.arrays;

public class MaxDiffBetweenArrayElements {

	public static void main(String[] args) {

		int ar [] = {3,1};
		
		int max = maxDiff(ar);
		System.out.println(max);

	}

	private static int maxDiff(int[] ar) {

		int max =0;
		
		for (int i = 0; i < ar.length-1; i++) {
			
			for (int j = i+1; j < ar.length; j++) {
				
				if(Math.abs(ar[i]-ar[j])>max)
					max = Math.abs(ar[i]-ar[j]);
				
			}
			
		}
		
		return max;
		
	}

}
	
	
/*
	// 	this method not satisfy for all the cases
	static int maxDiff(int[] a) {
	    int minimum, diff = -1;
	    if(a.length == 0) {
	        return -1;
	    }
	    minimum = a[0];
	    for (int i = 1; i < a.length; i++) {
	        diff = Math.max(diff, a[i] - minimum);
	        minimum = Math.min(minimum, a[i]);
	    }
	   // return diff;
	    // depending on interpretation of requirements, above line might be wrong
	    // Instead, use:
	    return diff > 0 ? diff : -1;
	}

}*/