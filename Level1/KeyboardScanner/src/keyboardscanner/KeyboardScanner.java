/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keyboardscanner;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author contia
 */
public class KeyboardScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        System.out.print("Enter a floating point number: ");
        double floatNumber = sc.nextDouble();
        System.out.print("Enter your name: ");
        String name = sc.next();
        double sum = floatNumber + number;
        System.out.println("Hi! " + name + ", the sum of " + number + " and " + floatNumber + " is " + sum);
    }
    
}
