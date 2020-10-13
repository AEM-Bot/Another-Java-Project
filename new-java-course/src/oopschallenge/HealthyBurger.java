package oopschallenge;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", "Rye Wheat Bread", meat, price);
    }

    public void addHealthAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }


    public void addHealthAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double totalPriceAfterAdditions() {
        double hamburgerPrice = super.totalPriceAfterAdditions();
        if (this.healthyExtra1Name != null) {
            hamburgerPrice += healthyExtra1Price;
        }
        if (this.healthyExtra2Name != null) {
            hamburgerPrice += healthyExtra2Price;
        }
        return hamburgerPrice;
    }
}
