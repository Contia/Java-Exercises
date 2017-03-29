/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

import java.util.ArrayList;

/**
 *
 * @author contia
 */
public class PhoneBook {
    private ArrayList<Contact> contacts;
    public PhoneBook(){
       contacts = new ArrayList<>(); //we must always create an object before we use it
    }
    public void addContact(Contact contact){
        contacts.add(contact);
    } 
    public Contact getContact(String name){
        for (Contact contact : contacts){
            if (contact.getName().equals(name)){
                return contact;
            }
        }
        return null;
    }
}
