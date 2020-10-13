package oopschallenge;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe Burger",
                "white", "Sausage and Bacon", 14.54);
        super.additionalItem1("Chips", 2.75);
        super.additionalItem2("Drinks", 1.81);
    }

    @Override
    public void additionalItem1(String name, double price) {
        System.out.println("Cannot add additional items to Deluxe Burger");
    }

    @Override
    public void additionalItem2(String name, double price) {
        System.out.println("Cannot add additional items to Deluxe Burger");
    }

    @Override
    public void additionalItem3(String name, double price) {
        System.out.println("Cannot add additional items to Deluxe Burger");
    }

    @Override
    public void additionalItem4(String name, double price) {
        System.out.println("Cannot add additional items to Deluxe Burger");
    }
}
