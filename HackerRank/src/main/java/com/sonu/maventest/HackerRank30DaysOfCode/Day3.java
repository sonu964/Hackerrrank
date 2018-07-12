package com.sonu.maventest.HackerRank30DaysOfCode;

	import java.util.*;
	
	public class Day3 {
	    
	    public static void check(int n){
	        
	        if(n%2 == 1)
	        {
	            System.out.println("Weird");
	        }
	        else if(n%2==0 & n>=2 & n<=5)
	        {
	            System.out.println("Not Weird");
	        }
	         else if(n%2==0 & n>=6 & n<=20)
	        {
	            System.out.println("Weird");
	        }
	        else if(n%2==0 &  n>=20)
	        {
	            System.out.println("Not Weird");
	        }
	        
	    }
	        



	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int N = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        check(N);
	        scanner.close();
	    }
	}