package arraylists;

import java.util.Scanner;

public class MobilePhoneRunner {

    private static MobilePhone mobilePhone = new MobilePhone("123456");

    private static Scanner scanner = new Scanner(System.in);

//
//    Contacts contact1 = new Contacts("Sasanka",
//            "408-477-6303");
//        mobilePhone.addContact(contact1);
//    Contacts contact3 = new Contacts("Chintam",
//            "408-234-6303");
//
//        mobilePhone.addContact(contact3);
//
//        System.out.println(" Contact List after adding the contacts ");
//        mobilePhone.printContactsList();
//    // mobilePhone.modifyContact(contact1, new Contacts("Test", "090909"));
//
////        System.out.println("Contact list after modifying the contacts");
////        mobilePhone.printContactsList();
//
////        mobilePhone.removeContact("Test");
////        System.out.println("Contact List after deleting the contact");
//
//        mobilePhone.printContactsList();
//
//        System.out.println(mobilePhone.onFile(contact1));
////        mobilePhone.onFile("Chintam");

    public static void main(String[] args) {


        int options = 0;
        boolean quit = false;
        menuOptions();
        while (!quit) {
            System.out.print("Enter your options:");
            options = scanner.nextInt();
            scanner.nextLine();
            switch (options) {
                case 0:
                    menuOptions();
                    break;
                case 1:
                    mobilePhone.printContactsList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }

        }

    }

    private static void searchContact() {
        System.out.print("Enter Contact Name to be searched: ");
        String name = scanner.nextLine();
        mobilePhone.onFile(name);
    }

    private static void removeContact() {
        System.out.print("Enter Contact to be searched");
        String name = scanner.nextLine();

        mobilePhone.removeContact(name);
    }

    private static void modifyContact() {
//        System.out.print("Enter Old Contact Name to be modified: ");
//        String name = scanner.nextLine();
//        System.out.print("Enter Phone Number: ");
//        String oldPhoneNumber = scanner.nextLine();
//        Contacts oldContact = Contacts.createContact(name, oldPhoneNumber);
//
//        System.out.println("Enter new Contact name:");
//
//        String newName = scanner.nextLine();
//        System.out.println("Enter new Phone Number: ");
//        String newPhoneNumber = scanner.nextLine();
//
//        Contacts newContact = Contacts.createContact(newName, newPhoneNumber);
//
//        mobilePhone.modifyContact(oldContact, newContact);

        System.out.print("Enter Contact to be searched");
        String name = scanner.nextLine();

        Contacts existingContact = mobilePhone.onFile(name);

        System.out.print("Enter new contact name ");
        String newName = scanner.nextLine();

        System.out.print("Enter new Phone Number:");
        String newNumber = scanner.nextLine();

        Contacts newContact = Contacts.createContact(newName, newNumber);

        mobilePhone.modifyContact(existingContact, newContact);

    }

    private static void addContact() {
        System.out.print("Enter Contact Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Contact Number: ");
        String phoneNumber = scanner.nextLine();

        /*  This is static method created in Contacts
            so that not to create new instance every time
         */
        Contacts newContact = Contacts.createContact(name, phoneNumber);
        mobilePhone.addContact(newContact);
        //mobilePhone.addContact(new Contacts(name, phoneNumber));
    }


    public static void menuOptions() {
        System.out.println("\t 0 - To Show Menu Options");
        System.out.println("\t 1- To print the list of contacts");
        System.out.println("\t 2- To add contact");
        System.out.println("\t 3- To modify contact");
        System.out.println("\t 4- To Remove Contact");
        System.out.println("\t 5- To Search Contact");
        System.out.println("\t 6- Quit Application");
    }

}
