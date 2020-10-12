public class Monitor {

    private String model;

    private String manufacturer;

    private int size;

    /*
        Monitor " has a " resolution --> Composition ::::
        not " is a " resolution --> Inheritance

        Composition vs Inheritance depends on the use case
        so inheritance is not always the solution
     */
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + " , "
                + y + " color " + color);
    }
}
