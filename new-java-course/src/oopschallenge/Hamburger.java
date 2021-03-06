package oopschallenge;


/*
    Base class--> Hamburger
 */
public class Hamburger {

    private String name;
    private String breadRollType;
    private String meat;
    private double price;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    /*
            additional items like lettuce, tomato etc.
            lettuce --> 1
            tomato --> 0.5
            carrot --> 1
            mayo --> 0.5
         */
    public void additionalItem1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void additionalItem2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void additionalItem3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void additionalItem4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double totalPriceAfterAdditions() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " +
                this.breadRollType + " roll " + " with " + this.meat + " price is " + this.price);
        if (this.addition1Name != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + "for an extra "
                    + this.addition1Price);
        }
        if (this.addition2Name != null) {
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + "for an extra "
                    + this.addition2Price);
        }
        if (this.addition3Name != null) {
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + "for an extra "
                    + this.addition3Price);
        }
        if (this.addition4Name != null) {
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name + "for an extra "
                    + this.addition4Price);
        }
        return hamburgerPrice;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }
}
