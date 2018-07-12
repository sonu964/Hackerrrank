package com.sonu.maventest.HackerRank30DaysOfCode;

	import java.util.*;
	   

		public class Day5 {
		    public static void first10Multiple(int n){
		       
		        int result = 0;
		        
		        for(int i = 1; i<= 10; i++)
		        {
		             result =  n * i;
		            System.out.println(n +" x " + i+ " = "+result);
		            
		        }
		        
		        
		    }


		    private static final Scanner scanner = new Scanner(System.in);

		    public static void main(String[] args) {
		        int n = scanner.nextInt();
		        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		        first10Multiple(n);
		        scanner.close();
		    }
		}