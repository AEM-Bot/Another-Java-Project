package linkedlists;


import java.util.ArrayList;

/*
    This is conceptual Linked List Example
    Linked List stores the address for each integer, string or object

 */
public class LinkedListConcepts {

    public static void main(String[] args) {

        Customer customer = new Customer("Sasanka", 1000.00);
        Customer customer1;

        customer1 = customer;
        customer1.setBalance(2000.00);

        customer.setBalance(4000.00);
        System.out.println("Balance for Customer " + customer.getName() + " is " +
                customer.getBalance());
        System.out.println("ANother customer balance " + customer1.getBalance());

        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(1);
        integers.add(2);
        integers.add(3);

        /*
            This is problem while adding certain elements at particular index
            all the elements has to be moved or changed etc..
            that's where LinkedList comes into the picture
            LinkedList stores --> each element in the list holds the value of itself and
            link to the elements besides it  also called as doubly linked list
            Iterate through the elements instead of indexing
         */
        for (int i = 0; i < integers.size(); i++) {
            System.out.println(i + " " + integers.get(i));
        }
        integers.add(1, 10);
        for (int i = 0; i < integers.size(); i++) {
            System.out.println(i + " " + integers.get(i));
        }
    }
}
