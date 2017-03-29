/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkvowelsdigits;

import java.util.Scanner;

/**
 *
 * @author contia
 */
public class CheckVowelsDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String string = sc.next();
        int numOfVowels = 0;
        int numOfDigits = 0;
        string = string.toLowerCase();
        for (int i=0;i<string.length();i++){
           char letter = string.charAt(i);
           switch(letter){
               case 'a': 
               case 'e':
               case 'i':
               case 'o':
               case 'u': numOfVowels++; break;
           }
           if (letter >='0' && letter <='9')
              numOfDigits++;
        }
        double perVowels = (numOfVowels*1.0/string.length())*100.0;
        double perDigits = (numOfDigits*1.0/string.length())*100.0;
        System.out.println("Number of vowels: " + numOfVowels + " (" + perVowels + "%)");
        System.out.println("Number of vowels: " + numOfDigits + " (" + perDigits + "%)");
    }
    
}
