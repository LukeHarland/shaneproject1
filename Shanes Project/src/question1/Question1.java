/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.util.Scanner;

/**
 *
 * @author Jared
 */
public class Question1 {
    
    public static void main (String[] args){
        
        Question1 obj = new Question1();
        
       Scanner sc = new Scanner(System.in); 
       
        System.out.println("Enter your sentence");
        String sentence = sc.nextLine();
        
        while(sentence.length() < 10){
            
            System.out.println("Error your sentence is too short");
            
            System.out.println("Enter your sentence");
            sentence = sc.nextLine();
        
        }
            
        System.out.println("Your sentence reversed is: " + reverse(sentence));
        System.out.println("The longest word in the sentence is: " + longestWord(sentence));
        System.out.println("Is the sentence a palidrome? " + palindrome(sentence));
        
    }
    
    public static String reverse( String sentence){
        String[] split = sentence.split(" ");
        String result = "";
        for (int i = split.length - 1; i >= 0; i--) {
            result += (split[i] + " ");
        }   
        
        return result;
        
    }
    
    public static String longestWord(String sentence){
        
        String lw="";
        int l=0;
        String words[]=sentence.split(" ");
        for(String word:words)
        {
                if(word.length()>l)
                {
                        lw=word;
                        l = word.length();
                }
        }
        return lw;
    }
    
    public static String palindrome(String sentence){

        String palindrome = null;
          int n = sentence.length();
          for (int i = 0; i < (n/2); ++i) {
            if (sentence.charAt(i) != sentence.charAt(n - i - 1)) {
                palindrome = "No";
            } else{
                palindrome = "Yes";
            }
          }

            return palindrome;
    }
    
}
