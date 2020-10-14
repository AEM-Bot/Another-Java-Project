package arraylists;

import java.util.ArrayList;
import java.util.Scanner;

/*
    This class does not have any logic just accessing the methods defined in the GroceryList
    class. this is the best practice for having the business logic in one place
    Oops concepts best example --> Encapsulation here and overloading methods,
 */

public class GroceryListRunner {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    private static void processArrayList() {
        ArrayList<String> newArrayList = new ArrayList<>();
        newArrayList.addAll(groceryList.getGroceryList());
        //adding entire contents of array

        ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList());
        //another way of copying..whole contents of arraylist

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);

    }

    private static void searchForItem() {
        System.out.print("Enter item to be searched: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem);
        } else {
            System.out.println(searchItem + " is not found in the list");
        }
//        if (groceryList.findGroceryItem(searchItem) != null) {
//            System.out.println("Found" + searchItem);
//        } else {
//            System.out.println(searchItem + " is not in the list");
//        }
    }

    private static void removeItem() {

        System.out.print("Enter item name ");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
        //groceryList.removeGroceryItem(itemNo - 1);

    }

    private static void modifyItem() {
        System.out.print("Enter item name ");
        String item = scanner.nextLine();
        System.out.print("Enter replacement item ");
        String newItem = scanner.nextLine();

        groceryList.modifyGroceryItem(item, newItem);

        //groceryList.modifyGroceryItem(itemNo - 1, newItem);
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To Print Choice Options");
        System.out.println("\t 1- To print the list of grocery items");
        System.out.println("\t 2- To add an item to the list");
        System.out.println("\t 3- To modify an item in the list");
        System.out.println("\t 4- To remove an item from the list");
        System.out.println("\t 5- To search for an item in the list");
        System.out.println("\t 6- To Process the Array List ");
        System.out.println("\t 7- To quit the application");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }


}
