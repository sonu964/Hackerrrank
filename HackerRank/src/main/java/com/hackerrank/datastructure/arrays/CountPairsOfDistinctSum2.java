package com.hackerrank.datastructure.arrays;

public class CountPairsOfDistinctSum2 {

	public static void count(int [] ar, int k) {
		int count = 0;

		int len = ar.length;
		for (int i = 0; i < ar.length; i++) {

			for (int j = i+1; j < ar.length; j++) {

				if(ar[i] > ar[j]) {

					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}

		}

		int l = 0;
		int  r = ar.length-1;
		while(l<r) {
			if(ar[l]+ar[r]> k) {
				r--;
			}else if(ar[l]+ar[r]< k) {
				l++;
			}else {
				l++;
				++count;
				System.out.println(ar[l]+" "+ar[r]);
			}
		}
		System.out.println("hi");
		System.out.println(count);
	}

	public static void main(String[] args) {

		int ar[] = {-1,1,5,8,9,7,-8,12,16,9,8,-30,-4};

		int k = 17;

		count(ar,k);

	}

}
