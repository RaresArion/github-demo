package Section10.Exercise2;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> myContacts;
    private String myNumber;

    public MobilePhone (String myNumber, ArrayList<Contact> myContacts) {
        this.myContacts = myContacts;
        this.myNumber = myNumber;
    }

    public MobilePhone (String myNumber) {
        this.myContacts = new ArrayList<>();
        this.myNumber = myNumber;
    }

    public boolean addNewContact (Contact contact) {
        if (findContact(contact) >= 0) {
            return false;
        } else {
            this.myContacts.add(contact);
            return true;
        }
    }

    public boolean updateContact (Contact oldC, Contact newC) {
        if (findContact(oldC) >= 0) {
            this.myContacts.set(this.myContacts.indexOf(oldC), newC);
//            System.out.println("Contact exists and was replaced " + this.myContacts.get(this.myContacts.indexOf(newC)));
            return true;
        } else {
//            System.out.println("Contact does NOT exist");
            return false;
        }
    }

    public boolean removeContact (Contact contact) {
//        System.out.println("removeContact -> " + findContact(contact));
        if(findContact(contact) >= 0) {
            this.myContacts.remove(contact);
//            System.out.println("Contact was removed");
            return true;
        } else {
//            System.out.println("Contact does NOT exist");
            return false;
        }
    }

    private int findContact (Contact contact) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            String thisName = this.myContacts.get(i).getName();
//            System.out.println("findContact(C c) - name from arr: " + thisName);
//            System.out.println("findContact(C c) - name from contact " + contact.getName());
            if (contact.getName().equals(thisName)) {
//                System.out.println("index is: " + i);
                return i;
            }
        }
//
//        System.out.println("index of contact from 'findContact(C c)': " + this.myContacts.indexOf(contact) + " name " + contact.getName() + " and nr: " + contact.getPhoneNumber());
//        for (Contact c : this.myContacts) {
//            if (c.getName().equals(contact.getName())){
//                return this.myContacts.indexOf(c);
//            }
//        }
        return -1;
    }

    private int findContact (String str) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            if (this.myContacts.get(i).getName().equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact (String str) {
        for (Contact c : this.myContacts) {
            if (c.getName().equals(str)) {
                return c;
            }
        }
        return null;
    }

    public void printContacts () {
        System.out.println("Contact List:");
        for (int i = 0; i < this.myContacts.size(); i++) {
            String x = String.format("%d. %s -> %s", i + 1, this.myContacts.get(i).getName(), this.myContacts.get(i).getPhoneNumber());
            System.out.println(x);
        }
    }
}
