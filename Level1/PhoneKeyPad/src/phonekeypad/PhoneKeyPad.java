/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonekeypad;

import java.util.Scanner;

/**
 *
 * @author contia
 */
public class PhoneKeyPad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String string = sc.next().toLowerCase();
        for (int i=0;i<string.length();i++){
            switch(string.charAt(i)){
                case 'a':
                case 'b':
                case 'c': System.out.print(2); break;
                case 'd': 
                case 'e':
                case 'f': System.out.print(3); break;
                case 'g': 
                case 'h':
                case 'i': System.out.print(4); break;
                case 'j':
                case 'k':
                case 'l': System.out.print(5); break;
                case 'm':
                case 'n':
                case 'o': System.out.print(6); break;
                case 'p': 
                case 'q':
                case 'r': 
                case 's': System.out.print(7); break;
                case 't':
                case 'u': 
                case 'v': System.out.print(8); break;
                default : System.out.print(9); break;
                
                
            }
            
        }
        System.out.println();
    }
    
}
