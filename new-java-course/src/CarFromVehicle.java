public class CarFromVehicle extends Vehicle {

    private int gears;
    private int doors;
    private int wheels;
    private boolean isManual;

    private int currentGear;


    public CarFromVehicle(String name, String size, int gears, int doors,
                          int wheels, boolean isManual) {
        super(name, size);
        this.gears = gears;
        this.doors = doors;
        this.wheels = wheels;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): changed to " +
                this.currentGear +
                "gear");
    }

    public void changeVelocity(int speed, int direction) {
        move(speed, direction);
        System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " +
                direction);
    }

    public int getGears() {
        return gears;
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getCurrentGear() {
        return currentGear;
    }
}
