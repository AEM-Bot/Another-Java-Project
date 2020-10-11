public class AnimalRunner {

    /*
        Every class is extending from the Object class
        Object is the super class and at the top of hierarchy
        (all classes internally extends from Object Class)
        by overriding can have separation of concerns as well
     */

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1,
                5, 5);
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4,
                1, 20, "long silky");
        /*
            dog. will show many methods that are not present in
            Dog Class but they are Animal Class
            If dog.eat() does not have override method then the super class method
            will be invoked or else dog class method will be invoked

         */
        dog.eat(); //dog.chew method is overridden inside the dog class
        dog.walk();
        dog.run();

    }
}
