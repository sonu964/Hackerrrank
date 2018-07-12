package com.hackerrank.datastructure.arrays;

public class Demo {
	
	public static void main(String[] args) {
		convertToBinary(10);
	}
	static void convertToBinary(int no){
	    int container[] = new int[100];

	    int i = 0;

	    while (no > 0){
	        container[i] = no%2;
	        i++;
	        no = no/2;
	    }

	    for (int j = 0 ; j < i ; j++){
	        System.out.println("container["+j+" ]= "+ container[j]);
	    }
	}

}
