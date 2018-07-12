package com.sonu.maventest.HackerRank30DaysOfCode;

	import java.util.*;
	   

		public class Day6 {
		    


 
   public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan1 = new Scanner(System.in);
        int time =scan1.nextInt();
        scan1.nextLine();
        
        while(time>0)
            {
        	
   
        String str= scan1.nextLine();
     
        
        char arr[] = str.toCharArray();
        int len= str.length();
        
        for(int x=0;x<len;x=x+2)
            {
            
            System.out.print(arr[x]);
            
            }
        
        System.out.print(" ");
        
         for(int x=1;x<len;x=x+2)
            {
            
            System.out.print(arr[x]);
         }
        
        System.out.println();
        
        time--;
        }  
        
        scan1.close();
    }
/*   
   public void displayEvenOddString(String str){
       
       String odd = "";
       String even = "";
       
        char ch [] = str.toCharArray();
       
       for(int i = 0; i< ch.length; i++){
           
           if(i%2==0){
               
               even = even + ch[i];
           }else{
               odd = odd + ch[i];
           }
           
           
       }
       System.out.println(even +" "+ odd);
       
   }

   public static void main(String[] args) {
        Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. 
       
       Scanner scan = new Scanner(System.in);
       int T = scan.nextInt();
         scan.nextLine();
        String S = null;
       for(int i = 0; i< T; i++){
           
             S = scan.nextLine();
            Solution s = new Solution();
       s.displayEvenOddString(S);
       }
      
        
       */  
 
       
   }
