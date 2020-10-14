package arraylists;

import java.util.ArrayList;

/*
    Full Grocery List --> ArrayList still uses Array Data Structure
 */
public class GroceryList {
    //private ArrayList<Integer> arrayList = new ArrayList<>();

    private ArrayList<String> groceryList = new ArrayList<>();


    public void addGroceryItem(String item) {
        groceryList.add(item);
//        groceryList.add("Tomato");
//        groceryList.add("Cucumber");
//        groceryList.add("Onions");
//        groceryList.add("Chicken");
//        groceryList.add("Cilantro");
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() +
                " items in your grocery list");

        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(((i + 1) + " . " + groceryList.get(i)));
        }
    }

    //overloaded method
    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findGroceryItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery Item " + (position + 1) +
                " has been modified");
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);
        System.out.println("Grocery Item " + (position + 1) +
                " has been removed");
    }

    public void removeGroceryItem(String item) {
        int position = findGroceryItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private int findGroceryItem(String searchItem) {
//        boolean exists = groceryList.contains(searchItem);
//        if (exists) {
//            System.out.println(searchItem + " exist ");
//        }
//        else {
//            System.out.println(searchItem + " Not found in the Grocery List");
//        }
//        int position = groceryList.indexOf(searchItem);
//        if (position >= 0) {
//            return groceryList.get(position);
//        }
//        return searchItem + " Not Found in the list";

        return groceryList.indexOf(searchItem);

    }

    public boolean onFile(String searchItem) {
        int position = findGroceryItem(searchItem);
        if (position >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }
}
