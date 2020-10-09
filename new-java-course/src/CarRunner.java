public class CarRunner {

    public static void main(String[] args) {
        //Car car --> Definition (Object)
        //new Car() --> Initialize (Object)
        //Car Class
        // car object
        Car car = new Car();
        Car porsche = new Car();

        //best practice --> encapsulation --> not allowing to access fields directly
        //instead access the methods and the underlying logic happens within the method
        porsche.setDoors(4);
        //System.out.println(porsche.getDoors());
        // never do this --> porsche.doors =4; against encapsulation
        //encapsulation hiding fields and exposing only the methods

        porsche.setColor("Silver");
        porsche.setModel("carrera");

        System.out.println("Model is: " + porsche.getModel());
        System.out.println("Color is: " + porsche.getColor());
        System.out.println("No of doors: " + porsche.getDoors());

        // porsche.getModel();

        // null is internal default state for Classes and String Class
        // getModel without setModel results in null

    }
}
