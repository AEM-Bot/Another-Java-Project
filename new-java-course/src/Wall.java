public class Wall {
    private double width;
    private double height;

    /*
        Default constructor
     */
    public Wall() {

    }
    /*
        Constructor with Parameters
     */

    public Wall(double width, double height) {
        setWidth(width);
        setHeight(height);
    }


    public void setWidth(double width) {
        if (width < 0.0d) {
            this.width = 0.0d;
        } else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if (height < 0.0d) {
            this.height = 0.0d;
        } else {
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return (width * height);
    }
}