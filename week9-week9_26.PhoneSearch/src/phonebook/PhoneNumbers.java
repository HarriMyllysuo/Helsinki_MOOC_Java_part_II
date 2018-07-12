/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PhoneNumbers {

    private Map<String, Person> phoneBook;
    private Map<String, Person> bookInOrder;

    public PhoneNumbers() {
        this.phoneBook = new HashMap<String, Person>();
        this.bookInOrder = new TreeMap<String, Person>(phoneBook);
    }

    public void addPhoneNumber(String name, String phoneNumber) {
        if (!this.phoneBook.containsKey(name)) {
            this.phoneBook.put(name, new Person(name));
            this.phoneBook.get(name).addNumber(phoneNumber);
        } else {
            this.phoneBook.get(name).addNumber(phoneNumber);
        }
    }

    public void addAddress(String name, String street, String city) {
        if (!this.phoneBook.containsKey(name)) {
            this.phoneBook.put(name, new Person(name));
            this.phoneBook.get(name).addAddress(street, city);
        } else {
            this.phoneBook.get(name).addAddress(street, city);
        }
    }
    
    public void deletePersonsInformation(String name) {
        if (this.phoneBook.containsKey(name)) {
            phoneBook.remove(name);
        }
    }

    public Map getPhoneBook() {
        return this.phoneBook;
    }

    public List getPersonsNumbers(String name) {
        return this.phoneBook.get(name).getNumbers();
    }

    public String getPersonsAddress(String name) {
        String s = "not found";
        for (Person p : phoneBook.values()) {
            if (p.getName().equals(name) && p.getAddress() == null) {
                s = "address unknown";
            } else if (p.getName().equals(name)) {
                s = "address: " + p.getAddress();
            } /* else {
                s = "not found";
            } */
        }
        return s;
    }

    public String getPersonsNameByPhoneNumber(String number) {
        String s = "";
        for (Person p : phoneBook.values()) {
            if (p.getNumbers().contains(number)) {
                s += p.getName();
            } else {
                s += "not found";
            }
        }
        return s;
    }
    
    public String listAll() {
        String s = "";
        for (Person p : bookInOrder.values()) {
            s += "\n " + p.getName() + "\n";
            s += "  " + getPersonsAddress(p.getName()) + "\n";
            if (getPersonsNumbers(p.getName()).isEmpty()) {
                s += "  phone number not found\n";
            } else {
                s += "  phone numbers:\n";
                for (int i = 0; i < getPersonsNumbers(p.getName()).size(); i++) {
                    s += "   " + getPersonsNumbers(p.getName()).get(i) + "\n";
                }
            }
        }
        return s;
    }
}
