/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkoddeven;

import java.util.Scanner;

/**
 *
 * @author contia
 */
public class CheckOddEven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number");
        int number = sc.nextInt();
        if (number % 2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
        System.out.println("BYE!");
    }
    
}
