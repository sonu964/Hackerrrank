package com.hackerrank.datastructure.arrays;
//https://www.hackerrank.com/challenges/lonely-integer
//https://github.com/RyanFehr/HackerRank/blob/master/Algorithms/Bit%20Manipulation/Lonely%20Integer/Solution.java
import java.util.*;

public class LonleyInteger {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = 0;
		for (int i = 0; i < n; i++) {
			a ^= in.nextInt();
		}
		System.out.println(a);
		in.close();
	}
}
//{4,6,4,6,2,2,3} so output be 3