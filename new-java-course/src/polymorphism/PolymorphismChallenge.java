package polymorphism;

class Kia extends Car {
    public Kia() {
        super("Soul", 4);
    }

    @Override
    public void startEngine() {
        System.out.println("Kia soul engine started");
    }
}

class Toyota extends Car {
    public Toyota() {
        super("Camry", 6);
    }

    @Override
    public void startEngine() {
        System.out.println("Toyota Camry Engine started");
    }
}

class BMW extends Car {
    public BMW() {
        super("528i", 4);
    }

//    @Override
//    public void startEngine() {
//        System.out.println("BMW 528i Engine started");
//    }
}

class Car {

    private String name;
    private int wheels;
    private boolean engine;
    private int cylinders;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public void startEngine() {
        System.out.println("Car Engine started");
    }

    public void accelerate() {
        System.out.println("Pressed Gas Pedal...Car is accelerating");
    }

    public void brake() {
        System.out.println("Breaks applied..car is decelerating");
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}

public class PolymorphismChallenge {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Car car = randomCar();
            System.out.println("Random Car # " + i + "\t");
            car.startEngine();
        }
    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random Number generated is: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Kia();
            case 2:
                return new Toyota();
            case 3:
                return new BMW();

        }
        return null;
    }

}
