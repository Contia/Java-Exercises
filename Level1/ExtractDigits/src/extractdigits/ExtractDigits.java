/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extractdigits;

import java.util.Scanner;

/**
 *
 * @author contia
 */
public class ExtractDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number");
        int number = sc.nextInt();
        while (number > 0){
            int digit = number % 10;
            System.out.print(digit + " ");
            number /= 10;
        }
        System.out.println();
    }
    
}
