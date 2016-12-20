/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

import javax.swing.JOptionPane;

/**
 *
 * @author Jared
 */
public class Question2 {
    
    public static void main (String[] args){
        
        String input = JOptionPane.showInputDialog(null, "Enter your name and surname: ");
        JOptionPane.showMessageDialog(null, input);
        String[] nameParts = input.split(" ");

        char firstInitial = nameParts[0].charAt(0);
        char lastInitial = nameParts[1].charAt(0);

       
        JOptionPane.showMessageDialog(null, firstInitial + " " + lastInitial);
        
        
        int i, length, vowels = 0;
        String j;
        //length = input.length();
        for (i = 0; i < input.length(); i++)
        {

          j = input.substring(i, i+1);
         

          if (j.equalsIgnoreCase("a") == true)
            vowels++;
          else if (j.equalsIgnoreCase("e") == true)
            vowels++;
          else if (j.equalsIgnoreCase("i") == true)
            vowels++;
          else if (j.equalsIgnoreCase("o") == true)
            vowels++;
          else if (j.equalsIgnoreCase("u") == true)
            vowels++;

        }
        JOptionPane.showMessageDialog(null, vowels);
        
        String r = "";
        for (int x = 0; x < input.length(); x++) {
            if (x % 2 == 1) {
                r += input.substring(x, x + 1).toUpperCase();
            } else {
                r += input.substring(x, x + 1);
            }   
        }
        JOptionPane.showMessageDialog(null, r);
        
        
        }
    
}
