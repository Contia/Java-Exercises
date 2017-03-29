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
public class Menu {
    public Menu(){
        
    }
    public void addContact(PhoneBook phoneBook){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.next();
        System.out.print("Enter the number: ");
        String number = sc.next();
        Contact contact = new Contact(name,number);
        phoneBook.addContact(contact);
    }
    public void getContact(PhoneBook phoneBook){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.next();
        Contact contact = phoneBook.getContact(name);
        System.out.println("The number is " + contact.getNumber());
    }
    public boolean exit(){
        return true;
    }
}
