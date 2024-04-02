package core;

import java.util.ArrayList;
import java.util.List;

public class Repertoire {
    private List<Contact> contacts;

    public Repertoire() {
        contacts = new ArrayList<>();
    }

    // Getter pour les contacts
    public List<Contact> getContacts() {
        return contacts;
    }

    // Setter pour les contacts
    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    // Manipulation des contacts (ajouter, supprimer, modifier, rechercher)...
    public void ajouterContact(Contact contact) {
        contacts.add(contact);
    }

    public void supprimerContact(Contact contact) {
        contacts.remove(contact);
    }

    public void modifierContact(Contact contact) {
        
    }

    public Contact rechercherContact(String code) {
        for (Contact contact : contacts) {
            if (contact.getCode().equals(code)) {
                return contact;
            }
        }
        return null;
    }
}
