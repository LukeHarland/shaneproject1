/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

import java.util.Arrays;

/**
 *
 * @author Jared
 */
public class Question3 {
    
    public static void main (String[] args) {
        //fibonacci
         int n1=0,n2=1,n3, i;    
         System.out.print(n1+" "+n2);   
    
            for(i=2;i<6;++i)   
            {    
             n3=n1+n2;    
             System.out.print(" "+n3);    
             n1=n2;    
             n2=n3;    
            } 
        
            //bubble sort
            int[] numArray = {
                3,5,8,9,2,12,14,16
            };
            int j = 0;
            boolean flag = true;   // set flag to true to begin first pass
            int temp;   //holding variable

            while ( flag )
            {
                    flag= false;    //set flag to false awaiting a possible swap
                    for( j=0;  j < numArray.length -1;  j++ )
                    {
                           if ( numArray[ j ] < numArray[j+1] )   // change to > for ascending sort
                           {
                                   temp = numArray[ j ];                //swap elements
                                   numArray[ j ] = numArray[ j+1 ];
                                   numArray[ j+1 ] = temp;
                                  flag = true;              //shows a swap occurred  
                            } 
                           
                    } 
                    
            } 
            System.out.printf("%n");
            System.out.println(Arrays.toString(numArray));
            
           // FizzBuzz question easy 
            for (int y = 1; y < 101; y= y +1) {
            
    
                
                
                if (y % 3 ==0 && y % 6 ==0){
                
                    System.out.println("FizzBuzz");
                
                }else if (y % 3 ==0) {
                    
                    System.out.println("Fizz");
                    
                }else if (y % 6 ==0) {
                    
                    System.out.println("Buzz");
                    
                }else{
                    System.out.println(y);
                }
                
            }
            
          
            
        // prime numbers question and i dont know what to do help please
        int[] numbers = new int[100]; 
        for(int b = 0; b < numbers.length; b++) {
        int randoms;
        randoms = (int)(Math.random()*101 + 1);
        
            for (int c = 2; c <= randoms/2; c++) {
                
                if (randoms%c == 0) {
                    
                }else{
                    numbers[b]= randoms;
                }
            }
        
    }
    System.out.println("Numbers Generated: " + Arrays.toString(numbers));       
    
    //triangle question
    for (int l=1; l<10; l += 2)
    {
        for (int p=0; p < (4 - l / 2); p++)
        {
            System.out.print(" ");
        }
        for (int h=0; h<l; h++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }  
            
    }

  
}
