package phonebookhashmap;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author contia
 */
public class Menu {
        public Menu(){
        
    }
    public void addContact(PhoneBook phoneBook){
        ArrayList<String> numbers;
        numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.next();
        boolean eof = false;
        while (!eof){
          System.out.print("Enter the number or press -1: ");  
          String number = sc.next();
          if (!number.equals("-1")){
            numbers.add(number);
          }else eof = true;
        }
        
        phoneBook.addContact(name,numbers);
    }
    public void getContact(PhoneBook phoneBook){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.next();
        ArrayList<String> numbers = phoneBook.getNumbers(name);
        for (String number: numbers){
            System.out.println(number);
        }
        
    }
    public boolean exit(){
        return true;
    }
}
