/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

import java.util.ArrayList;
import java.util.List;

public class Person {
    
    private String name;
    private List<String> numbers;
    private String address = null;
    // private List<String> address;
    
    public Person(String name) {
        this.name = name;
        this.numbers = new ArrayList<String>();
        //this.address = "";
        // this.address = new ArrayList<String>();
    }
    
    public void addNumber(String number) {
        this.numbers.add(number);
    }
    
    public void addAddress(String street, String city) {
        this.address = street + " " + city;
        // this.address.add(street + " " + city);
    }
    
    public String getName() {
        return this.name;
    }
    
    public List getNumbers() {
        return this.numbers;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    /* public List getAddress() {
        return this.address;
    } */
}
