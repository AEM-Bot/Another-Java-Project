package linkedlists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/*
    Need Learn More on Iterator and list iterator
    Extremely powerful for auto sorting etc..
 */

public class Demo {
    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<>();

        addInOrder(placesToVisit, "Virginia");
        addInOrder(placesToVisit, "New York");
        addInOrder(placesToVisit, "Florida");
        addInOrder(placesToVisit, "New Jersey");
        addInOrder(placesToVisit, "Colorado");

        printList(placesToVisit);
//        placesToVisit.add("New York");
//        placesToVisit.add("New Jersey");
//        placesToVisit.add("Florida");
//        placesToVisit.add("Virginia");
//        placesToVisit.add("Colorado");
        //placesToVisit.remove("Colorado");


//        printList(placesToVisit);
//
//        placesToVisit.add(1, "Atlanta");
//
//        printList(placesToVisit);
//
//        placesToVisit.remove(4);
//
//        printList(placesToVisit);

        visit(placesToVisit);
    }

    public static void printList(LinkedList<String> linkedList) {
        Iterator<String> stringIterator = linkedList.iterator();
        while (stringIterator.hasNext()) {
            System.out.println("Now visiting: " + stringIterator.next());
        }
        System.out.println("=====================");
    }

    public static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        //.next usually should be avoided --> synchronous or asynchronous
        //stringListIterator.next(); //get to the first entry
        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                //do not add if the same city exists
                System.out.println(newCity + " already included as destination");
                return false;
            } else if (comparison > 0) {
                //new City appear before the element
                // Brisbane --> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                //move on to next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();
        if (cities.isEmpty()) {
            System.out.println("No cities in the itinerary");
        } else {
            System.out.println("Now Visiting: " + listIterator.next());
            printMenu();
        }
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Vacation Over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");

                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now Visiting " + listIterator.previous());
                    } else {
                        System.out.println("Start of the list");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available Options: \n press ");
        System.out.println("0- To Quit \n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3- print menu options"
        );
    }
}
