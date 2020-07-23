package com.company.main;

import java.util.ArrayList;
import java.util.List;

class ContactsDatabase {
    List<Contact> contacts;

    public ContactsDatabase () {
        contacts = new ArrayList<>();
        contacts.add(new Contact("Domino","Jachas",500200300,"domino.jachas@gmail.com"));
        contacts.add(new Contact("Arnoldo","Schwarz",200300500,"arni@o2.pl"));
        contacts.add(new Contact("Jan","Kowalski",900200300,"jan.kowalski@interia.pl"));
        contacts.add(new Contact("Eliza","Mozart",200300200,"eliza@eliza.com"));
        contacts.add(new Contact("Maryla","Rodowicz",101001001,"jak_ona_sie_tu_znalazla@gmail.com"));
    }

    public void list() {
        for(int i = 0 ; i < contacts.size(); i++) {
            System.out.println("["+ i +"]" + contacts.get(i));
        }
    }

    public String searchByName(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (name.toLowerCase().equals(contact.getLastName().toLowerCase())) {
                return "["+i+"]"+ contact.toString();
            }
        }
        return null;
    }

    public int size() {
        return contacts.size();
    }

    public void deleteByIndex(int choice) {
        int size = contacts.size()-1;
        contacts.remove(choice);
    }

    public void add(String firstName, String lastName, int number, String e_mail) {
        contacts.add(new Contact(firstName,lastName,number,e_mail));
    }
}
