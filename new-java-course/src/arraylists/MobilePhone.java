package arraylists;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> contactsList;

    /*
        always use this whenever possible it makes sure this instance of is being used and
        more readable code
     */
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contactsList = new ArrayList<Contacts>();
    }

    public boolean addContact(Contacts newContact) {
        if (findContact(newContact.getName()) >= 0) {
            System.out.println("Contact " + newContact.getName()
                    + " already exists ");
            return false;
        }
        System.out.println("Contact created successfully: " + newContact.getName());
        this.contactsList.add(newContact);
        return true;

    }

    public boolean modifyContact(Contacts oldContact, Contacts newContact) {
        if ((findContact(oldContact)) >= 0 && (findContact(newContact.getName()) == -1)) {
            this.contactsList.set(findContact(oldContact), newContact);
            System.out.println("Successfully modified the contact");
            return true;
        } else {
            System.out.println("Unable to update contact " + oldContact.getName());
            return false;
        }
    }


    private int findContact(String contactName) {
        for (int i = 0; i < this.contactsList.size(); i++) {
            if (this.contactsList.get(i).getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    private int findContact(Contacts contacts) {
        return this.contactsList.indexOf(contacts);
    }

    private String onFile(Contacts contacts) {
        if (findContact(contacts) >= 0) {
            return contacts.getName();
        } else {
            return null;
        }
    }

    public Contacts onFile(String contactName) {
        if (findContact(contactName) >= 0) {
            System.out.println("Found Contact:");
            return this.contactsList.get(findContact(contactName));
        } else {
            System.out.println("Could not find contact with " + contactName);
            return null;
        }
    }

    public boolean removeContact(Contacts contacts) {
        if (findContact(contacts) >= 0) {
            this.contactsList.remove(findContact(contacts));
            System.out.println(contacts.getName() + " is deleted: ");
            return true;
        } else {
            System.out.println("Unable to delete contact as " + contacts.getName() + " does not exist ");
            return false;
        }
    }

    public boolean removeContact(String contactName) {
        if (findContact(contactName) >= 0) {
            this.contactsList.remove(findContact(contactName));
            System.out.println(contactName + " is deleted: ");
            return true;
        } else {
            System.out.println("Unable to delete contact as " + contactName + " does not exist ");
            return false;
        }
    }


    public void printContactsList() {
        System.out.println("You have " + this.contactsList.size() +
                " contacts in your contacts list");
        for (int i = 0; i < this.contactsList.size(); i++) {
            System.out.println((i + 1) + " Contact Name: "
                    + this.contactsList.get(i).getName() + " Phone Number: "
                    + this.contactsList.get(i).getPhoneNumber());
        }
    }

    public ArrayList<Contacts> getContactsList() {
        return contactsList;
    }
}
