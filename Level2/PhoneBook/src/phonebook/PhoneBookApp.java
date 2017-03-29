/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

import java.util.Scanner;

/**
 *
 * @author contia
 */
public class PhoneBookApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean endOfExecution=false;
        Menu menu = new Menu();
        PhoneBook phoneBook = new PhoneBook();
        while (!endOfExecution){
            System.out.println("------MENU------");
            System.out.println("1: Add Contact");
            System.out.println("2: Get Contact");
            System.out.println("3: Exit");
            Scanner sc = new Scanner(System.in);
            switch(sc.nextInt()){
                case 1: menu.addContact(phoneBook); break;
                case 2: menu.getContact(phoneBook); break;
                case 3: endOfExecution = menu.exit();
            }
        }
    }
    
}
