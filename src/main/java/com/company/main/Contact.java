package com.company.main;

class Contact {
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String e_mail;

    public Contact(String firstName, String lastName, int phoneNumber, String e_mail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.e_mail = e_mail;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getE_mail() {
        return e_mail.toLowerCase();
    }

    @Override
    public String toString() {
        return
                firstName+
                ", " + lastName +
                ", " + phoneNumber +
                ", " + e_mail;
    }
}
