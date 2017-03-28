/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filescanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author contia
 */
public class FileScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int number;
            double doubleNumber;
            String name;
            try ( // TODO code application logic here
                Scanner in = new Scanner(new File("input.txt")).useLocale(Locale.US)) {
                number = in.nextInt();
                doubleNumber = in.nextDouble();
                name = in.next();
            }
            double sum = doubleNumber + number;
            System.out.println("Hi! " + name + ", the sum of " + number + " and " + doubleNumber + " is " + sum);

        } catch (FileNotFoundException ex) {
            System.out.println("There isn't this file");
        }
    }
    
}
