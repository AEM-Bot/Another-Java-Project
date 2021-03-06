public class Cylinder extends Circle {
    private double height;


    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0.0d) {
            this.height = 0.0d;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return (getArea() * height);
    }

}