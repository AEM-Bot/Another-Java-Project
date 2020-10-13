package oopschallenge;

public class HamburgerRunner {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "White",
                "Chicken", 3.56d);
        double price = hamburger.totalPriceAfterAdditions();
        hamburger.additionalItem1("lettuce", 0.27d);
        hamburger.additionalItem2("tomato", .75d);
        hamburger.additionalItem2("cheese", 1.25d);
        System.out.println("Total Price is: " + hamburger.totalPriceAfterAdditions());

        HealthyBurger healthyBurger = new HealthyBurger("Chicken", 5.6d);
        healthyBurger.addHealthAddition1("lettuce", 1.0d);
        healthyBurger.addHealthAddition2("Ranch", 0.5d);

        System.out.println("Healthy Burger Price is: " + healthyBurger.totalPriceAfterAdditions());


        DeluxeBurger deluxeBurger = new DeluxeBurger();

        deluxeBurger.additionalItem1("lettuce", 2.0d);
        System.out.println(deluxeBurger.totalPriceAfterAdditions());
    }
}
