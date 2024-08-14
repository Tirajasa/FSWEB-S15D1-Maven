package org.example.mobile;

import java.util.Objects;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static String createContact(String name, String phoneNumber){
        return "getName() -> getPhoneNumber()";
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Contact contact)) return false;
        return Objects.equals(name, contact.name) && Objects.equals(phoneNumber, contact.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber);
    }
}
