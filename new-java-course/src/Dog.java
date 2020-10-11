//extends keyword for inheritance from super class
// is a relationship for inheritance
public class Dog extends Animal {

    //below fields are characteristics in addition to the base animal class
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //super is used to access/call parent class members (fields or methods)
    //this is used to call current class members(fields or methods)
    //we can use both anywhere except in static blocks or static methods

    //this --> commonly used in constructors and setters
    //super --> commonly used with method overriding

    //this() only used in constructor --> must be first line in constructor
    //super() must be the first statement in constructor
    public Dog(String name, int size, int weight, int eyes, int legs,
               int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
        //super keyword is super class extending --> Animal
    }

    private void chew() {
        System.out.println("Dog.chew() is called ");
    }

    //usually do not use super.eat() etc as functionality specific to one class may happen
    @Override
    public void eat() {
        System.out.println("Dog.eat() is called");
        chew();
        super.eat();
        //automatically checks for the super class and calls the super class method
        //even though the same methods existing in this class it still invokes the super class only
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }
}
