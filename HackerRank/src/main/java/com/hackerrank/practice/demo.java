package com.hackerrank.practice;

public class demo {

	private static  final String  STAR = "*";
	private static  final String  SPACE = " ";
	
	static int arr[][] = 
		{
				{1,0,0,0,0,0,1},
				{0,1,0,0,0,1,0},
				{0,0,1,0,1,0,0},
				{0,0,0,1,0,0,0},
				{0,0,1,0,1,0,0},
				{0,1,0,0,0,1,0},
				{1,0,0,0,0,0,1}
		};
	
	
	public static void main(String[] args) {
		
	for(int[] ar : arr )
	{
		for(int a : ar)
		{
			System.out.print((a==1)?STAR:SPACE);
		}
		System.out.println();
	}
	
	}
}
