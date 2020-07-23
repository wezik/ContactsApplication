package com.company.main;

import java.util.Scanner;

class ContactsApplication {

    private Scanner scanner;
    private ContactsDatabase database;
    private boolean end;

    public ContactsApplication() {
        scanner = new Scanner(System.in);
        database = new ContactsDatabase();
        end = false;
    }

    private void showContacts(){
        System.out.println("==============================================================");
        database.list();
        System.out.println("==============================================================");
    }

    private void addContact(){
        System.out.println("::Enter First Name::");
        String firstName = getString();
        System.out.println("::Enter Last Name::");
        String lastName = getString();
        int number = 0;
        while (number < 99999999) {
            System.out.println("::Enter Phone Number::");
            number = getChoice();
        }
        System.out.println("::Enter E-Mail::");
        String e_mail = getString();
        database.add(firstName,lastName,number,e_mail.toLowerCase());
        System.out.println("Contact added successfully");
    }

    private void searchContact(){
        System.out.println("::Enter LastName::");
        String name = getString();
        String contact = database.searchByName(name);
        System.out.println(contact);
    }

    private void removeContact() {
        System.out.println("::Enter contact index::");
        int choice = getChoice();
        if (choice < database.size()) {
            database.deleteByIndex(choice);
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Failed to delete\n");
            removeContact();
        }
    }

    public void run() {
        printMenu();

        while (!end) {
            int choice = getChoice();

            if (choice == 1) {
                showContacts();
            }
            if (choice == 2) {
                addContact();
            }
            if (choice == 3) {
                searchContact();
            }
            if (choice == 4) {
                removeContact();
            }
            if (choice == 5) {
                end = true;
            }
            if (choice == 0) {
                run();
            }
        }
    }

    private int getChoice() {
        return scanner.nextInt();
    }

    private String getString() {
        return scanner.next();
    }

    private void printMenu() {
        System.out.println("Hello, the following actions are available");

        System.out.println("1 - show contacts");
        System.out.println("2 - add contact");
        System.out.println("3 - search contact by last name");
        System.out.println("4 - remove contact");
        System.out.println("5 - exit");
        System.out.println("0 - bring back menu");
    }
}
