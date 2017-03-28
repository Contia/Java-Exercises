/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computepi;

/**
 *
 * @author contia
 */
public class ComputePI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long n = 1000000000;
        double sum = 0.0;
        for (int i=1;i<=n;i++){
            if (i % 4 == 1) sum += 1.0/i;
            else if (i % 4 == 3) sum-= 1.0/i;
        }
        sum*=4;
        System.out.println("PI is: " + sum);
        System.out.println("Original PI is: " + Math.PI);
        System.out.println("The Difference is: " + (Math.PI - sum));
        
        // There is a subtle difference between our PI and the original.
        
        
    }
    
}
