/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product1ton;

/**
 *
 * @author contia
 */
public class Product1ToN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int j=0;j<=4;j++){
            long product=1;
            int i;
            for (i=1;i<=10+j;i++){
                product *= i;
            }
            System.out.println("Result 1 to " + (i-1) +" " + product);
        }
        System.out.println("Result 1 to 10 " +1*2*3*4*5*6*7*8*9*10);
        System.out.println("Result 1 to 11 " +1*2*3*4*5*6*7*8*9*10*11);
        System.out.println("Result 1 to 12 " +1*2*3*4*5*6*7*8*9*10*11*12);
        System.out.println("Result 1 to 13 " +1*2*3*4*5*6*7*8*9*10*11*12*13);
        System.out.println("Result 1 to 14 " +1*2*3*4*5*6*7*8*9*10*11*12*13*14);
        
        // The products 1 to 13 and 1 to 14 are incorrect. The reason is that 
        // the variables of type int cannot store so big numbers. 
    }
    
}
