package org.example.mobile;

import java.util.List;

public class MobilePhone {
    private String myNumber;
    private List<Contact> myContacts;

    public String getMyNumber() {
        return myNumber;
    }

    public List<Contact> getMyContacts() {
        return myContacts;
    }

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    public MobilePhone( String myNumber,List<Contact> myContacts) {
        this.myContacts = myContacts;
        this.myNumber = myNumber;
    }

    public boolean addNewContact(Contact number) {
        if (!myContacts.contains(number)) {
            myContacts.add(number);
            return true;
        } else {
            return false;
        }
    }

    public boolean updateContact(Contact number, Contact newNumber) {
        if (myContacts.contains(number)) {
            myContacts.remove(number);
            myContacts.add(newNumber);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Contact number) {
        if (myContacts.contains((number))) {
            myContacts.remove(number);
            return true;
        } else {
            return false;
        }
    }

    public int findContact(Contact number) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).equals(number)) {
                return i;
            } else {

            }
        }
        return -1;
    }
    //return myContacts.indexOf(number);
    public int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact=myContacts.get(i);
            if (contact.getName().equalsIgnoreCase(name)) {
                return i;
            } else {

            }
        }
        return -1;
    }

    public Contact queryContact(String name){
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact=myContacts.get(i);
            if (contact.getName().equals(name)){
                return contact;
            }
        }
        return null;
    }
    public void printContact() {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            System.out.println(contact);
        }
    }
}
