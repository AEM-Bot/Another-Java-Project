public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        if (width < 0.0d) {
            this.width = 0.0d;
        } else {
            this.width = width;
        }
        if (length < 0.0d) {
            this.length = 0.0d;
        } else {
            this.length = length;
        }
    }

    public double getArea() {
        return (width * length);
    }
}