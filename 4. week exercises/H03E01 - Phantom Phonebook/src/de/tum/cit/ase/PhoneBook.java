package de.tum.cit.ase;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> contacts;

    // Constructor initializes the contacts list
    public PhoneBook() {
        this.contacts = new ArrayList<>();
    }

    // Getter and Setter for contacts
    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    // Find Contact by Name
    public String findContactNumber(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact.getPhoneNumber();
            }
        }
        return null; // Return null if contact not found
    }

    // Add New Contact
    public void addNewContact(String name, String phoneNumber, boolean isSealDeputy) {
        Contact newContact = new Contact(name, phoneNumber, isSealDeputy);
        contacts.add(newContact);
    }

    // Remove Contact by Name
    public Contact removeContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contacts.remove(contact);
                return contact; // Return removed contact
            }
        }
        return null; // Return null if contact not found
    }

    // Update Phone Number
    public Contact updateContactNumber(String name, String newNumber) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contact.setPhoneNumber(newNumber);
                return contact; // Return updated contact
            }
        }
        return null; // Return null if contact not found
    }

    // Find Seal Deputies
    public List<Contact> findSealDeputies() {
        List<Contact> sealDeputies = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getIsSealDeputy()) {
                sealDeputies.add(contact);
            }
        }
        return sealDeputies;
    }
}
