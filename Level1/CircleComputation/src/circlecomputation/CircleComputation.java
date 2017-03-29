/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlecomputation;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author contia
 */
public class CircleComputation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.printf("The are is: %1.2f \n", area);
        double diameter = radius * 2;
        double circumference = Math.PI * diameter;
        System.out.printf("The circumference is: %1.2f \n",circumference);
    }
    
}
