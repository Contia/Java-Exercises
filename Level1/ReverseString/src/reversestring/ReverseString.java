/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestring;

import java.util.Scanner;

/**
 *
 * @author contia
 */
public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String string = sc.next();
        String newString = "";
        for (int i=string.length()-1;i>=0;i--){
            newString += string.charAt(i);
        }
        System.out.println("The reverse of the String \"" + string + "\" is \"" + newString + "\"");
       
    }
    
}
