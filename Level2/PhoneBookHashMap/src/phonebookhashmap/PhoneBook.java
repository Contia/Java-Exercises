/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebookhashmap;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author contia
 */
public class PhoneBook {
    private HashMap<String,ArrayList<String>> contacts;
    public PhoneBook(){
        contacts = new HashMap<>();
    }
    public void addContact(String name, ArrayList<String> numbers){
        contacts.put(name, numbers);
    }
    public ArrayList<String> getNumbers(String name){
        return contacts.get(name);
    }
}
