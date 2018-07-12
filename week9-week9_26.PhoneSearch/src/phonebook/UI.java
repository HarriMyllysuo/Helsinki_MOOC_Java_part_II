/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

import java.util.Scanner;

public class UI {
    // User Interface
    private Scanner reader;
    private PhoneNumbers pn;
    
    public UI() {
        this.reader = new Scanner(System.in);
        this.pn = new PhoneNumbers();
    }
    
    public void start() {
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");
        
        while (true) {
            System.out.print("\ncommand: ");
            String command = this.reader.nextLine();
            if (command.equals("x")) {
                break;
            }
            else if (command.equals("1")) {
                addNumber();
            }
            else if (command.equals("2")) {
                searchNumber();
            }
            else if (command.equals("3")) {
                searchNameByPhoneNumber();
            }
            else if (command.equals("4")) {
                addAddress();
            }
            else if (command.equals("5")) {
                searchPersonalInformation();
            }
            else if (command.equals("6")) {
                deletePersonalInformation();
            }
            else if (command.equals("7")) {
                filteredListing();
            }
        }
    }
    
    public void addNumber() {
        System.out.print("whose number: ");
        String name = this.reader.nextLine();
        System.out.print("number: ");
        String number = this.reader.nextLine();
        pn.addPhoneNumber(name, number);
    }
    
    public void searchNumber() {
        System.out.print("whose number: ");
        String name = this.reader.nextLine();
        if (this.pn.getPhoneBook().containsKey(name)) {
            for (int i = 0; i < this.pn.getPersonsNumbers(name).size(); i++) {
                System.out.println(" " + this.pn.getPersonsNumbers(name).get(i));
            }
        } else {
            System.out.println("  not found");
        }
    }
    
    public void searchNameByPhoneNumber() {
        System.out.print("number: ");
        String number = this.reader.nextLine();
        System.out.println(" " + this.pn.getPersonsNameByPhoneNumber(number));
    }
    
    public void addAddress() {
        System.out.print("whose address: ");
        String name = this.reader.nextLine();
        System.out.print("street: ");
        String street = this.reader.nextLine();
        System.out.print("city: ");
        String city = this.reader.nextLine();
        this.pn.addAddress(name, street, city);
    }
    
    public void searchPersonalInformation() {
        System.out.print("whose information: ");
        String name = this.reader.nextLine();
        System.out.println("  " + pn.getPersonsAddress(name));
        searchNumber(name);
        /* if (this.pn.getPhoneBook().containsKey(name) && !pn.getPersonsNumbers(name).isEmpty()) {
            System.out.println("  phone numbers:");
            for (int i = 0; i < this.pn.getPersonsNumbers(name).size(); i++) {
                System.out.println("   " + this.pn.getPersonsNumbers(name).get(i));
            }
        } else if (this.pn.getPhoneBook().containsKey(name) && pn.getPersonsNumbers(name).isEmpty()) {
            System.out.println("  phone number not found");
        } */
    }
    
    private void searchNumber(String name) {
        if (this.pn.getPhoneBook().containsKey(name) && !pn.getPersonsNumbers(name).isEmpty()) {
            System.out.println("  phone numbers:");
            for (int i = 0; i < this.pn.getPersonsNumbers(name).size(); i++) {
                System.out.println("   " + this.pn.getPersonsNumbers(name).get(i));
            }
        } else if (this.pn.getPhoneBook().containsKey(name) && pn.getPersonsNumbers(name).isEmpty()) {
            System.out.println("  phone number not found");
        }
    }
    
    public void deletePersonalInformation() {
        System.out.print("whose information: ");
        String name = this.reader.nextLine();
        pn.deletePersonsInformation(name);
    }
    
    public void filteredListing() {
        System.out.print("keyword (if empty, all listed): ");
        String keyword = this.reader.nextLine();
        if (keyword.equals("")) {
            System.out.println(pn.listAll());
        }
    }
}
