/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author contia
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numbers =20;
        int f_1 = 1;
        int f_2 = 1;
        System.out.print(f_1 + " " + f_2 +" ");
        int sum=0;
        double average = f_1 + f_2;
        for (int i=2;i<20;i++){
            sum = f_1 + f_2;
            f_1 = f_2;
            f_2 = sum;
            System.out.print(sum + " ");
            average += sum;
        }
        average /= 20;
        System.out.println();
        System.out.println("The average is: " + average);
    }
    
}
