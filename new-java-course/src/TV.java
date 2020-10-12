public class TV {

    private String model;
    private String manufacturer;
    private int year;
    private int size;

    public TV(String model, String manufacturer, int year, int size) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public int getSize() {
        return size;
    }

    public void turnOffTV() {
        System.out.println("Turn Off Tv");
    }
}
