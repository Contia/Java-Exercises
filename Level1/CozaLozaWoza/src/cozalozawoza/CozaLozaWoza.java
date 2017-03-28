/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cozalozawoza;

/**
 *
 * @author contia
 */
public class CozaLozaWoza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i=1;i<=110;i++){
            if (i%3 == 0)
                System.out.print("Coza");
            if (i%5 == 0)
                System.out.print("Loza");
            if (i%7 == 0)
                System.out.print("Woza");
            
            if (i%3 !=0 && i%5 !=0 && i%7 !=0)
                System.out.print(i);
            if (i% 11 == 0)
                System.out.print("\n");
            else            
                System.out.print(" ");

        }
    }
    
}
