package com.sonu.maventest.HackerRank30DaysOfCode;

	import java.util.*;
	   
	public class Day7 {

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	    	
	    	System.out.println("Enter the size of array");
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        
	        int[] arr = new int[n];
	        
	        System.out.println("Enter the array elements in form of string");
	        String[] arrItems = scanner.nextLine().split(" ");
	       scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int arrItem = Integer.parseInt(arrItems[i]);
	            arr[i] = arrItem;
	        }
	        
	        for(int i = arr.length-1 ; i>=0; i--){
	            
	            System.out.print(arr[i]+" ");
	        }
	        scanner.close();
	    }
	}
