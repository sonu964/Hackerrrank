package com.hackerrank.practice;

import java.util.*;


public class JavaLoopsII {
	

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("Enter the integer values to perform number of quaries");
		
		int q = scan.nextInt();
		
		for (int i = 0; i < q; i++) 
		{
			int result = 0;
			System.out.println("Enter the value of a");
			int a = scan.nextInt();
			System.out.println("Enter the value of b");
			int b = scan.nextInt();
			System.out.println("Enter the value of n");
			int n = scan.nextInt();
			
			for (int j = 0; j < n; j++) 
			{
				if(j == 0)
				{
					result = result + ( a + power(2,j)*b);
				}
				else
				{
					result = result + power(2,j)*b;
				}
				
				System.out.print(result + " ");
			}
			System.out.println();
		}
		
		
		scan.close();
		
	}

	private static int power(int n, int pwr) {
		
		int sum = 1;
		
		for (int i = 0; i < pwr; i++) {
			
			sum = sum*n;
		}
		
		return sum ;
	}
	
	    
	}