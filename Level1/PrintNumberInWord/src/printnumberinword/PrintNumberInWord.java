/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printnumberinword;

import java.util.Scanner;

/**
 *
 * @author contia
 */
public class PrintNumberInWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       //a
       if (number ==1) System.out.println("ONE");
       else if (number == 2) System.out.println("TWO");
       else if (number == 3) System.out.println("THREE");
       else if (number == 4) System.out.println("FOUR");
       else if (number == 5) System.out.println("FIVE");
       else if (number == 6) System.out.println("SIX");
       else if (number == 7) System.out.println("SEVEN");
       else if (number == 8) System.out.println("EIGHT");
       else if (number == 9) System.out.println("NINE");
       else System.out.println("OTHER");
       
       //b 
       switch(number){
           case 1: System.out.println("ONE");  break;
           case 2: System.out.println("TWO");  break;
           case 3: System.out.println("THREE"); break;
           case 4: System.out.println("FOUR"); break;
           case 5: System.out.println("FIVE"); break;
           case 6: System.out.println("SIX"); break;
           case 7: System.out.println("SEVEN"); break;
           case 8: System.out.println("EIGHT"); break;
           case 9: System.out.println("NINE"); break;
           default: System.out.println("OTHER"); break;
       }
       
       
       
       
       
    }
    
}