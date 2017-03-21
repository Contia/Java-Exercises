/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkpassfail;

import java.util.Scanner;

/**
 *
 * @author contia
 */
public class CheckPassFail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a mark");
        int mark = sc.nextInt();
        if (mark >= 50)
            System.out.println("Pass");
        else 
            System.out.println("Fail");
        System.out.println("Done");
    }
    
}
