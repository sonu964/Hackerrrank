package com.hackerrank.java;

import java.util.Scanner;

public class JavaAnagrams {
	
	static boolean isAnagram(String a, String b) {
        // Complete the function
       
       // Arrays.sort(b); // it won't work in hackerrank
        
        String aa = a.toLowerCase();
        String bb = b.toLowerCase();
        
        char [] ch1 = aa.toCharArray();
        
        char [] ch2 = bb.toCharArray();
        
     
        
       for(int i = 0; i < ch1.length-1; i++){
            
            for(int j = i+1; j < ch1.length; j++){
                
                if(ch1[i] > ch1[j]){
                    
                    char temp = ch1[i];
                    ch1[i] = ch1[j];
                    ch1[j] = temp;
                }
                
            }
        }
        
         for(int i = 0; i < ch2.length-1; i++){
            
            for(int j = i+1; j < ch2.length; j++){
                
                if(ch2[i] > ch2[j]){
                    
                    char temp = ch2[i];
                    ch2[i] = ch2[j];
                    ch2[j] = temp;
                }
                
            }
        }
        
        
        if(ch1.length == ch2.length){
            
            for(int i = 0; i < ch1.length; i++){
                
                if(ch1[i] != ch2[i]){
                    
                    return false;
                }
            }
            
            return true;

        }else{
            
            return false;
        }
    }

	
	
	public static void main(String[] args) {
	    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
