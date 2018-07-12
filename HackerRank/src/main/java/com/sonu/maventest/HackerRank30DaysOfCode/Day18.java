package com.sonu.maventest.HackerRank30DaysOfCode;



import java.util.*;

/*

A palindrome is a word, phrase, number, or other sequence of characters which reads the same backwards and forwards. Can you determine if a given string,s , 
is a palindrome?
*/

public class Day18 {
	
 // Write your code here.
    
    Stack<Character> stack = new Stack<Character>();
    Queue<Character> queue = new LinkedList<>();
    
    // to insert characters into Stack
    public void pushCharacter(char ch){
        
        stack.push(ch);

    }
    // to insert characters into Queue
    void enqueueCharacter(char ch){
        
        queue.add(ch);
        
        
    }
    // to delete characters from Stack
    char popCharacter(){
        
       return stack.pop();
        
    }
    
     // to delete characters from Queue
    char dequeueCharacter(){
        
      return  queue.remove();
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18 p = new Day18();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}