package com.hackerrank.practice;

import java.util.*;

/*"In computing, End Of File (commonly abbreviated EOF) "
 "is a condition in a computer operating system where no more "
  "data can be read from a data source."
  
  *The challenge here is to read n lines of input until you reach EOF, then number and print all n lines of content.
  */
public class JavaEndOfFile {


	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        
	        Scanner scan = new Scanner(System.in);
	        int line = 1;
	        while(scan.hasNext())
	        {
	            System.out.println(line+" "+scan.nextLine());
	            line++;
	        }
	        
	        scan.close();
	        
	    }
	}
	
