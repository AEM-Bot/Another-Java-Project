public class Animal {
    /*
        classes to inherit the common behavior from another class
        all animals have some common/basic behavior
        Animal is basic class and any animal will have the common state and behavior

     */

    //Base class definition
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    /*
        Always use constructor chaining i.e, always last constructor with all the parameters
        is responsible for initializing the variables or fields
        no duplicate code at all
     */
    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Aninaml.eat() is called ");
    }

    public void move(int speed) {
        System.out.println("Animal.move() is moving at " + speed);
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
    /*
        Method Overloading ->
        1. same method name with different parameters
        2. return type may or may not be different
        3. handy, reduces duplicated code
        4. Compile Time polymorphism
        5. overload static and instance methods
        6. Must have same method name and different parameters
        Method Overriding
        1. defining method in child class that already exists in parent with same signature
        2. Child class get all the methods defined in the parent class --> these methods are called
        derived methods
        3. Runtime Polymorphism and Dynamic Method Dispatch
        4. Recommended to use/put @Override above method definition--> annotation
        5. can't override static methods only instance methods can be overridden
        6. Rules for Overriding -->
                Must have same name and arguments
                Return type can be a subclass of the return type in parent class
                can't have lower access modifier
        7. Only inherited methods can be overridden (only in child class)
        8. Constructors and private methods can not be overridden and methods final also cannot be overridden
        9. subclass can use super.methodName()
     */
    /*
        Static and Instance Methods
        Static -->
        1. declared using static modifier
        2. can't access instance methods an instance variables directly
        3. used no data from an instance of the class ex: this. etc
        4. this --> can't use this keyword
        5.ex: psvm
        Classname.methodName instead of instance variables
        static don't require creating of instance methods

        Instance -->
         specific to instance of class
         new keyword to create instance
         access instance methods and variables and static methods and static variables
        Use fields or instance methods --> yes --> Instance Method
                                        --> No --> Static Method
     */

    /*
        Static and Instance Variables
        Static -->
        static keyword
        static member variables
        same static variable across all which means that one place is changed
         all places will be changed not used often
         Instance -->
         Every instance has it's own copy of instance variable
         every instance different value
         this... will always update the each instance state (field)
     */
}
